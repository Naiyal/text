public class App {
    static void fun(Test n){
        n.number++;
    }
    public static void main(String[] args) throws Exception {
        Test num = new Test();
        num.number=1;
        fun(num);
        System.out.println(num.number);
    }
}
