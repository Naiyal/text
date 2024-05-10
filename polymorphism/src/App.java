public class App {
    public static void main(String[] args) {
        Employee e1 =new Employee("Mohammad","SF","IT","m@gmail.com",1000);
        SalariedEmployee e2 = new SalariedEmployee(200,"Mohammad","SF","IT","m@gmail.com",1000);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        DailyEmployee e3 = new DailyEmployee(20, 15, "Mohammad","SF","IT","m@gmail.com",1000);
        System.out.println(e3.getSalary());
        HourlyEmployee e4 =new HourlyEmployee(50, 4, "Mohammad","SF","IT","m@gmail.com",1000);
        System.out.println(e4.getSalary());
    }
}
