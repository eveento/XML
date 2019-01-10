import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class BookMain {

    private static final String BOOKSTORE_XML = "./bookstore.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Book> bookList = new ArrayList<>();

        // create books
        Book book1 = new Book();
        book1.setIsbn("342424325");
        book1.setName("Java XML");
        book1.setAuthor("Author");
        book1.setPublisher("Polskie Lasy");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setIsbn("342556546674");
        book2.setName("Frederico");
        book2.setAuthor("Roche");
        book2.setPublisher("Brazowe Lasy");
        bookList.add(book2);

        Bookstore bookstore = new Bookstore();
        bookstore.setName("Bookstore");
        bookstore.setLocation("Chopin Airport");
        bookstore.setBookList(bookList);

        /*
        MARSHALLER
         */
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        m.marshal(bookstore, System.out);

        // Write to File
        m.marshal(bookstore, new File(BOOKSTORE_XML));

        /*
        UNMARSHALLER
         */

        System.out.println();
        System.out.println("Output from our XML File: ");
        Unmarshaller um = context.createUnmarshaller();
        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(
                BOOKSTORE_XML));


        ArrayList<Book> list = bookstore2.getBooksList();
        for (Book book : list) {
            System.out.println("Book: " + book.getName() + " from "
                    + book.getAuthor());
        }
    }
}