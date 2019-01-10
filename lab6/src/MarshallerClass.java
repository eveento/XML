import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


// JAVA->XML
public class MarshallerClass {
    public static void main(String[] args) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Person person = new Person();
        person.setName("Basia");
        person.setSurname("Owczarek");
        person.setNickname("Malenka");
        person.setAge(23);
        person.setHeight(168);
        person.setWeight(54);
        person.setId(1);
//        marshaller.marshal(person, new File("person.xml"));
        marshaller.marshal(person,System.out);


//        JAXBContext ctxProduct = JAXBContext.newInstance(Product.class);
//        Marshaller marshallerProduct = ctxProduct.createMarshaller();
//        marshallerProduct.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//        Product product = new Product();
//        product.setName("Kebab");
//        product.setColor("Brazowy");
//        product.setPrice(12);
//        product.setType("bez frytek");
//        marshallerProduct.marshal(product,System.out);
    }

}
