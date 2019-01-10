import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Produkt")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    @XmlElement(required = true, name = "Typ")
    private String type;
    @XmlElement(required = true, name = "Nazwa")
    private String name;
    @XmlElement(required = true, name = "Cena")
    private int price;
    @XmlElement(required = true, name = "Kolor")
    private String color;

    public Product() {
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
