package csv;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\'\\|\'")
public class T100 {
    @DataField(pos = 1)
    private String SPRSL;
    @DataField(pos = 2)
    private String MSG;
    @DataField(pos = 3)
    private String MSGNR;
    @DataField(pos = 4)
    private String TEXT;
    @DataField(pos = 5)
    private String BIG_TRANSFERDATE;
    @DataField(pos = 6)
    private String BIG_TRANSFERTIME;
    @DataField(pos = 7)
    private String BIG_TRANSFERTSTAMP;

    public String getSPRSL() {
        return SPRSL;
    }

    public void setSPRSL(String SPRSL) {
        this.SPRSL = SPRSL;
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }

    public String getMSGNR() {
        return MSGNR;
    }

    public void setMSGNR(String MSGNR) {
        this.MSGNR = MSGNR;
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getBIG_TRANSFERDATE() {
        return BIG_TRANSFERDATE;
    }

    public void setBIG_TRANSFERDATE(String BIG_TRANSFERDATE) {
        this.BIG_TRANSFERDATE = BIG_TRANSFERDATE;
    }

    public String getBIG_TRANSFERTIME() {
        return BIG_TRANSFERTIME;
    }

    public void setBIG_TRANSFERTIME(String BIG_TRANSFERTIME) {
        this.BIG_TRANSFERTIME = BIG_TRANSFERTIME;
    }

    public String getBIG_TRANSFERTSTAMP() {
        return BIG_TRANSFERTSTAMP;
    }

    public void setBIG_TRANSFERTSTAMP(String BIG_TRANSFERTSTAMP) {
        this.BIG_TRANSFERTSTAMP = BIG_TRANSFERTSTAMP;
    }
}
