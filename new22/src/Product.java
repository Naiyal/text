/**
 * Product
 */
public class Product {

    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;

    public Product(){
        System.out.println("constructor");
    }

    public Product(String n,String d,float p,int q,float dis){
        this.name =n;
        this.description=d;
        this.price=p;
        this.quantity=q;
        this.discount=dis;
        System.out.println("#2");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
}