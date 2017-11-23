package pojo;

public class Product {
    private String productName;
    private String productDesc;
    private String productPrice;

    public Product(){
        System.out.println("无参数的构造函数");
    }
//    public Product(String productName, String productDesc, String productPrice) {
//        this.productName = productName;
//        this.productDesc = productDesc;
//        this.productPrice = productPrice;
//    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String save(){
        System.out.println("detail " + this);
        return "detail";
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
