public class App {
    public static void main(String[] args) {
        Math p1 =new Math(2);
        Math p2 =new Math(2);
        Math p3=p1.add(p2);
        System.out.println(p3.val);

        System.out.println(p1.inEquals(p2));
    }
}
