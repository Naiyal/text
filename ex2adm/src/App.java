public class App {
    public static void main(String[] args) throws Exception {
        Account a1 =new Account();
        Account a2 =new Account();
        Account a3 =new Account();
        
        a1.insert(4451238, "Mohammed", 10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        a1.toString();

        a2.insert(956314, "Belal", 100);
        a2.deposit(50);
        a2.withdraw(140);
        a2.checkBalance();
        a2.toString();

        a3.insert(4451238, "Ahmad", 500);
        a3.deposit(550);
        a3.withdraw(10);
        a3.checkBalance();
        a3.toString();
    }
}
