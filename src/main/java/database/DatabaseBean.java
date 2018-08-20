package database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Bean that creates the database table
 */
public class DatabaseBean {

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseBean.class);
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void create() throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        String sql1 = "create table T100 (\n"
                + "  SPRSL char(1),\n"
                + "  MSG varchar(20),\n"
                + "  MSGNR char(3),\n"
                + "  TEXT varchar(73),\n"
                + "  BIG_TRANSFERDATE varchar(20),\n"
                + "  BIG_TRANSFERTIME varchar(20),\n"
                + "  BIG_TRANSFERTSTAMP varchar(20)\n"
                + ")";

        String sql2 = "create table WBCROSSGT (\n"
                + "  OTYPE varchar(20),\n"
                + "  NAME varchar(120),\n"
                + "  INCLUDE varchar(40),\n"
                + "  DIRECT varchar(20),\n"
                + "  INDIRECT varchar(20),\n"
                + "  COMPONENT varchar(20),\n"
                + "  ISHASH varchar(20),\n"
                + "  UDATE varchar(20),\n"
                + "  UZEIT varchar(20),\n"
                + "  UNAME varchar(12),\n"
                + "  BIG_TRANSFERDATE varchar(20),\n"
                + "  BIG_TRANSFERTIME varchar(20),\n"
                + "  BIG_TRANSFERTSTAMP varchar(20)\n"
                + ")";

        LOG.info("Creating table T100, WBCROSSGT ...");

        try {
            jdbc.execute("drop table T100");
            jdbc.execute("drop table WBCROSSGT");
        } catch (Throwable e) {
            // ignore
        }

        jdbc.execute(sql1);
        jdbc.execute(sql2);

        LOG.info("... created tables T100, WBCROSSGT");
    }

    public void destroy() throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        try {
            jdbc.execute("drop table T100");
            jdbc.execute("drop table WBCROSSGT");
        } catch (Throwable e) {
            // ignore
        }
    }
}
