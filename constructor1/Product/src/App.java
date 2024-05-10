public class App {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product("Camera","Auto focus",99,10,5,"red");
        Product p2 = new Product(p1);
        
        p2.dicplay();
    }
}
