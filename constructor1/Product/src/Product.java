/**
 * Product
 */
public class Product {

    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;

    public Product() {
        this.name = "no name";
        this.description = "no description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount= 0;  
    }

    public Product(String n, String d, float p, int q, float dis) {
        this.name = n;
        this.description = d;
        this.price = p;
        this.quantity = q;
        this.discount = dis;  
    }

    Product(String n, String d, float p, int q, float dis,String c) {
        this (n,d,p,q,dis); //chaining
        this.color = c;
    }

    public Product(Product obj){
        this.name = obj.name;
        this.description = obj.description;
        this.price = obj.price;
        this.quantity = obj.quantity;
        this.discount = obj.discount;
        this.color = obj.color;
    }

    public void dicplay() {
        System.out.println("Name = "+name+"\nDescription = "+description+"\nPrice = "+price+"\nQuantity = "+quantity+"\nDiscount = "+discount+"\nColor = "+color);
    }

}