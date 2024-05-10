public class DailyEmployee extends Employee{
    private float workDayPrice;
    private int dailyRate;

    public void setWorkDayPrice(float workDayPrice){
        this.workDayPrice=workDayPrice;
    }

    public float getWorkDayPrice(){
        return workDayPrice;
    }

    public void setDailyRate(int dailyRate){
        this.dailyRate=dailyRate;
    }

    public int getDailyRate(){
        return dailyRate;
    }

    public DailyEmployee(float workDayPrice, int dailyRate,String name,String address,String department,String email,float salary){
        super(name, address, department, email, salary);
        this.workDayPrice=workDayPrice;
        this.dailyRate=dailyRate;
    }

    @Override
    public float getSalary(){
        return workDayPrice*dailyRate;
    }
}
