import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.camel.Message;

import java.io.InputStream;
import java.net.URI;

import static org.apache.camel.Exchange.HTTP_RESPONSE_CODE;
import static org.hamcrest.CoreMatchers.is;

public class atalayaEIPTest extends CamelBlueprintTestSupport {
    public static final String SPROP_CAMEL_CONTEXT_CREATION_TIMEOUT = "6000";

    private static final String URI_START = "direct:start";
    private static final String URI_END = "mock:result";

    protected static BrokerService broker;

    @Before
    public void setUp() throws Exception {
        // Embed a JMS Broker for testing
        broker = new BrokerService();
        TransportConnector connector = new TransportConnector();
        connector.setUri(new URI("tcp://localhost:61616"));
        broker.setBrokerName("activemq");
        broker.addConnector(connector);
        broker.setPersistent(false);
        broker.start();

        // Creates the Blueprint Context
        super.setUp();
    }

    @Override
    @After
    public void tearDown() throws Exception {
        super.tearDown();

        broker.stop();
        broker = null;
    }

    @Override
    protected String getBlueprintDescriptor() {
        return "/OSGI-INF/blueprint/datasource.xml,/OSGI-INF/blueprint/blueprint-atalayaEIP.xml";
    }

    @Test
    public void transferCSV() throws Exception {

        MockEndpoint result = getMockEndpoint("mock:result");
        result.expectedMessageCount(1);

        InputStream inStream = getClass().getClassLoader().getResourceAsStream("t100.csv");
        String payload = context.getTypeConverter().convertTo(String.class, inStream);

        Exchange exchange = template.request("netty4-http:http://localhost:8282/big/1.0/transfer/atalayaDs",
                new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        exchange.getIn().setHeader(Exchange.HTTP_METHOD, "POST");
                        exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "text/plain;charset=UTF-8");
                        exchange.getIn().setHeader("insertSQL", "insert into T100 (SPRSL, MSG, MSGNR, TEXT, BIG_TRANSFERDATE, BIG_TRANSFERTIME, BIG_TRANSFERTSTAMP) values (':#SPRSL', ':#MSG', ':#MSGNR', ':#TEXT', ':#BIG_TRANSFERDATE', ':#BIG_TRANSFERTIME', ':#BIG_TRANSFERTSTAMP')");
                        exchange.getIn().setBody(payload);
                    }
                });

        assertThat(exchange.getOut().getHeader(HTTP_RESPONSE_CODE, Integer.class), is(200));
    }
}