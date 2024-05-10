public class HourlyEmployee extends Employee{
    private float workOurPrice;
    private int hourlyRate;

    public void setWorkOurPrice(float workOurPrice){
        this.workOurPrice=workOurPrice;
    }

    public float getWorkOurPrice(){
        return workOurPrice;
    }

    public void sethourlyRate(int hourlyRate){
        this.hourlyRate=hourlyRate;
    }

    public int gethourlyRate(){
        return hourlyRate;
    }

    public HourlyEmployee(float workOurPrice, int hourlyRate,String name,String address,String department,String email,float salary){
        super(name, address, department, email, salary);
        this.workOurPrice=workOurPrice;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public float getSalary(){
        return workOurPrice*hourlyRate;
    }
}
