package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "OTYPE",
        "NAME",
        "INCLUDE",
        "DIRECT",
        "INDIRECT",
        "COMPONENT",
        "ISHASH",
        "UDATE",
        "UZEIT",
        "UNAME",
        "BIG_TRANSFERDATE",
        "BIG_TRANSFERTIME",
        "BIG_TRANSFERTSTAMP"
})
public class wbcrossgt implements Serializable {
    @JsonProperty("OTYPE")
    private String OTYPE;
    @JsonProperty("NAME")
    private String NAME;
    @JsonProperty("INCLUDE")
    private String INCLUDE;
    @JsonProperty("DIRECT")
    private String DIRECT;
    @JsonProperty("INDIRECT")
    private String INDIRECT;
    @JsonProperty("COMPONENT")
    private String COMPONENT;
    @JsonProperty("ISHASH")
    private String ISHASH;
    @JsonProperty("UDATE")
    private String UDATE;
    @JsonProperty("UZEIT")
    private String UZEIT;
    @JsonProperty("UNAME")
    private String UNAME;
    @JsonProperty("BIG_TRANSFERDATE")
    private String BIG_TRANSFERDATE;
    @JsonProperty("BIG_TRANSFERTIME")
    private String BIG_TRANSFERTIME;
    @JsonProperty("BIG_TRANSFERTSTAMP")
    private String BIG_TRANSFERTSTAMP;

    @JsonProperty("OTYPE")
    public String getOTYPE() { return OTYPE; }
    @JsonProperty("OTYPE")
    public void setOTYPE(String OTYPE) { this.OTYPE = OTYPE; }

    @JsonProperty("NAME")
    public String getNAME() { return NAME; }
    @JsonProperty("NAME")
    public void setNAME(String NAME) { this.NAME = NAME; }

    @JsonProperty("INCLUDE")
    public String getINCLUDE() { return INCLUDE; }
    @JsonProperty("INCLUDE")
    public void setINCLUDE(String INCLUDE) { this.INCLUDE = INCLUDE; }

    @JsonProperty("DIRECT")
    public String getDIRECT() { return DIRECT; }
    @JsonProperty("DIRECT")
    public void setDIRECT(String DIRECT) { this.DIRECT = DIRECT; }

    @JsonProperty("INDIRECT")
    public String getINDIRECT() { return INDIRECT; }
    @JsonProperty("INDIRECT")
    public void setINDIRECT(String INDIRECT) { this.INDIRECT = INDIRECT; }

    @JsonProperty("COMPONENT")
    public String getCOMPONENT() { return COMPONENT; }
    @JsonProperty("COMPONENT")
    public void setCOMPONENT(String COMPONENT) { this.COMPONENT = COMPONENT; }

    @JsonProperty("ISHASH")
    public String getISHASH() { return ISHASH; }
    @JsonProperty("ISHASH")
    public void setISHASH(String ISHASH) { this.ISHASH = ISHASH; }

    @JsonProperty("UDATE")
    public String getUDATE() { return UDATE; }
    @JsonProperty("UDATE")
    public void setUDATE(String UDATE) { this.UDATE = UDATE; }

    @JsonProperty("UZEIT")
    public String getUZEIT() { return UZEIT; }
    @JsonProperty("UZEIT")
    public void setUZEIT(String UZEIT) { this.UZEIT = UZEIT; }

    @JsonProperty("UNAME")
    public String getUNAME() { return UNAME; }
    @JsonProperty("UNAME")
    public void setUNAME(String UNAME) { this.UNAME = UNAME; }

    @JsonProperty("BIG_TRANSFERDATE")
    public String getBIG_TRANSFERDATE() { return BIG_TRANSFERDATE; }
    @JsonProperty("BIG_TRANSFERDATE")
    public void setBIG_TRANSFERDATE(String BIG_TRANSFERDATE) { this.BIG_TRANSFERDATE = BIG_TRANSFERDATE; }

    @JsonProperty("BIG_TRANSFERTIME")
    public String getBIG_TRANSFERTIME() { return BIG_TRANSFERTIME; }
    @JsonProperty("BIG_TRANSFERTIME")
    public void setBIG_TRANSFERTIME(String BIG_TRANSFERTIME) { this.BIG_TRANSFERTIME = BIG_TRANSFERTIME; }

    @JsonProperty("BIG_TRANSFERTSTAMP")
    public String getBIG_TRANSFERTSTAMP() { return BIG_TRANSFERTSTAMP; }
    @JsonProperty("BIG_TRANSFERTSTAMP")
    public void setBIG_TRANSFERTSTAMP(String BIG_TRANSFERTSTAMP) { this.BIG_TRANSFERTSTAMP = BIG_TRANSFERTSTAMP; }

}