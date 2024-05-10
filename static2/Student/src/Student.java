public class Student {

    private int no;
    private String name;
    private String password;
    private boolean loggedIn;
    private static int count =1;
    private static String college="IT";

    public Student(String name,String password) {
        count++;
        
        this.no =count;
        this.name =name;
        this.password =password;
    }

    public boolean login(int SNo ,String SPassword) {
        if(SNo==no && SPassword.equals(password)){
            loggedIn = true;
            return true;}
        else{
            return false;}
    }
}