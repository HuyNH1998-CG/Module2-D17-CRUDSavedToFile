import java.io.Serializable;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private String maker;
    private String price;
    private String others;

    public Product(String productID, String productName, String maker, String price, String others) {
        this.productID = productID;
        this.productName = productName;
        this.maker = maker;
        this.price = price;
        this.others = others;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", maker='" + maker + '\'' +
                ", price='" + price + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
