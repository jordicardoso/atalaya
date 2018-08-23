import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;
import org.apache.camel.CamelContext;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.test.blueprint.CamelBlueprintHelper;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.BundleContext;

import java.io.InputStream;
import java.net.URI;

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

    @Test (timeout = 8000)
    public void AggregationFileTest() throws Exception {

        MockEndpoint result = getMockEndpoint("mock:result");
        context.start();
        result.expectedMessageCount(100);

        Thread.sleep(2000);

        result.assertIsSatisfied();
        context.stop();
    }
}