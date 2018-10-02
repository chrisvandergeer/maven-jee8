package nl.cge.jee.ejb;

import nl.cge.jee.domein.MyDomain;

import javax.ejb.Stateless;
import java.time.LocalTime;

@Stateless
public class MySessionBean {

    public String helloWorld(String name) {
        MyDomain myDomain = new MyDomain(name);
        return String.format("on %s I said: %s", LocalTime.now().toString(), myDomain.helloWorld());
    }
}
