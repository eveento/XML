import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

// XML->JAVA
public class UnmarshallerClass {

    public static void main(String[] args) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();

        Person person = (Person) unmarshaller.unmarshal(new File("person.xml"));
        System.out.println(person);


    }
}
