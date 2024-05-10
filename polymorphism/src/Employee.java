public class Employee {
    private String name,address,department,email;
    private float salary;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return address;
    }

    public void setDepartment(String department){
        this.department=department;
    }

    public String getDepartment(){
        return department;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public void setSalary(float salary){
        this.salary=salary;
    }

    public float getSalary(){
        return salary;
    }

    public Employee (String name,String address,String department,String email,float salary){
        this.name=name;
        this.address=address;
        this.department=department;
        this.email=email;
        this.salary=salary;
    }
}
