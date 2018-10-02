package nl.cge.jee.domein;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MyDomain {

    private String uuid = UUID.randomUUID().toString();
    private String name;

    public MyDomain() {
        super();
    }

    public MyDomain(String name) {
        this.name = name;
    }

    public String helloWorld() {
        return String.format("%s: Hello %s", uuid, name);
    }
}
