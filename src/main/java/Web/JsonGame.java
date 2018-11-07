package Web;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JsonGame {
    @XmlElement
    public int id;
    @XmlElement
    public String player1;
    @XmlElement
    public String player2;

}
