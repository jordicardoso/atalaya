package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "SPRSL",
        "MSG",
        "MSGNR",
        "TEXT",
        "BIG_TRANSFERDATE",
        "BIG_TRANSFERTIME",
        "BIG_TRANSFERTSTAMP"
})
public class t100 implements Serializable {
    @JsonProperty("SPRSL")
    private String SPRSL;
    @JsonProperty("MSG")
    private String MSG;
    @JsonProperty("MSGNR")
    private String MSGNR;
    @JsonProperty("TEXT")
    private String TEXT;
    @JsonProperty("BIG_TRANSFERDATE")
    private String BIG_TRANSFERDATE;
    @JsonProperty("BIG_TRANSFERTIME")
    private String BIG_TRANSFERTIME;
    @JsonProperty("BIG_TRANSFERTSTAMP")
    private String BIG_TRANSFERTSTAMP;

    @JsonProperty("SPRSL")
    public String getSPRSL() { return SPRSL; }

    @JsonProperty("SPRSL")
    public void setSPRSL(String SPRSL) { this.SPRSL = SPRSL; }

    @JsonProperty("MSG")
    public String getMSG() { return MSG; }

    @JsonProperty("MSG")
    public void setMSG(String MSG) { this.MSG = MSG; }

    @JsonProperty("MSGNR")
    public String getMSGNR() { return MSGNR; }

    @JsonProperty("MSGNR")
    public void setMSGNR(String MSGNR) { this.MSGNR = MSGNR; }

    @JsonProperty("TEXT")
    public String getTEXT() { return TEXT; }

    @JsonProperty("TEXT")
    public void setTEXT(String TEXT) { this.TEXT = TEXT; }

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