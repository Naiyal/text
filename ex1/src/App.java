public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Circle c1 = new Circle(), c2 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("Black");
        System.out.println(c1.toString());
        System.out.println("c1 area =" + c1.getArea());
        c2.setRadius(2.0);
        c2.setColor("Blue");
        System.out.println(c1.toString());
        System.out.println("c1 Circutference =" + c1.getCircutference());
    }
}
