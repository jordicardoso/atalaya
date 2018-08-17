package csv;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\'\\|\'")
public class WBCROSSGT {
    @DataField(pos = 1)
    private String OTYPE;
    @DataField(pos = 2)
    private String NAME;
    @DataField(pos = 3)
    private String INCLUDE;
    @DataField(pos = 4)
    private String DIRECT;
    @DataField(pos = 5)
    private String INDIRECT;
    @DataField(pos = 6)
    private String COMPONENT;
    @DataField(pos = 7)
    private String ISHASH;
    @DataField(pos = 8)
    private String UDATE;
    @DataField(pos = 9)
    private String UZEIT;
    @DataField(pos = 10)
    private String UNAME;
    @DataField(pos = 11)
    private String BIG_TRANSFERDATE;
    @DataField(pos = 12)
    private String BIG_TRANSFERTIME;
    @DataField(pos = 13)
    private String BIG_TRANSFERTSTAMP;

    public String getOTYPE() {
        return OTYPE;
    }
    public void setOTYPE(String OTYPE) {
        this.OTYPE = OTYPE;
    }

    public String getNAME() {
        return NAME;
    }
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getINCLUDE() {
        return INCLUDE;
    }
    public void setINCLUDE(String INCLUDE) {
        this.INCLUDE = INCLUDE;
    }

    public String getDIRECT() {
        return DIRECT;
    }
    public void setDIRECT(String DIRECT) {
        this.DIRECT = DIRECT;
    }

    public String getINDIRECT() { return INDIRECT; }
    public void setINDIRECT(String INDIRECT) { this.INDIRECT = INDIRECT; }

    public String getCOMPONENT() { return COMPONENT; }
    public void setCOMPONENT(String COMPONENT) { this.COMPONENT = COMPONENT; }

    public String getISHASH() { return ISHASH; }
    public void setISHASH(String ISHASH) { this.ISHASH = ISHASH; }

    public String getUDATE() { return UDATE; }
    public void setUDATE(String UDATE) { this.UDATE = UDATE; }

    public String getUZEIT() { return UZEIT; }
    public void setUZEIT(String UZEIT) { this.UZEIT = UZEIT; }

    public String getUNAME() { return UNAME; }
    public void setUNAME(String UNAME) { this.UNAME = UNAME; }

    public String getBIG_TRANSFERDATE() { return BIG_TRANSFERDATE; }
    public void setBIG_TRANSFERDATE(String BIG_TRANSFERDATE) { this.BIG_TRANSFERDATE = BIG_TRANSFERDATE; }

    public String getBIG_TRANSFERTIME() { return BIG_TRANSFERTIME; }
    public void setBIG_TRANSFERTIME(String BIG_TRANSFERTIME) { this.BIG_TRANSFERTIME = BIG_TRANSFERTIME; }

    public String getBIG_TRANSFERTSTAMP() { return BIG_TRANSFERTSTAMP; }
    public void setBIG_TRANSFERTSTAMP(String BIG_TRANSFERTSTAMP) { this.BIG_TRANSFERTSTAMP = BIG_TRANSFERTSTAMP; }
}
