/**
 * SalariedEmployee
 */
public class SalariedEmployee extends Employee {
    float bound;

    public void setBound(float bound){
        this.bound=bound;
    }

    public float getBound(){
        return bound;
    }
    @Override
    public float getSalary(){
        return super.getSalary()+bound;
    }
    
    public SalariedEmployee(float bound,String name,String address,String department,String email,float salary){
        super(name, address, department, email, salary);
        this.bound=bound;
    }
}