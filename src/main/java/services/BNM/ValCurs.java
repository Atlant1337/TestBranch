package services.BNM;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("ValCurs")
public class ValCurs {

    @XStreamAlias("Date")
    @XStreamAsAttribute
    private String date;

    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;

    @XStreamImplicit(itemFieldName = "Valute")
    private List<services.BNM.Valute> valutes;

    public String getDate1(String date) {
        return date;
    }

    public void setDate1(String date) {
        this.date = date;
    }


    public void setName(String name) {
        this.name = name;
    }

    public List<services.BNM.Valute> getValutes() {
        return valutes;
    }

    public void setValutes(List<services.BNM.Valute> valutes) {
        this.valutes = valutes;
    }
}