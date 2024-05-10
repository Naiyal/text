package first;

public class SUV extends Car{
    int x;
    public SUV(int x ,float height,float weight,int number){
    super(height,weight,number);
    this.x=x;
    }
    @Override
    void autopilot() {
        // TODO Auto-generated method stub
        System.out.println("SUV autopilot");
        
    }

    @Override
    void parking() {
        // TODO Auto-generated method stub
        System.out.println("SUV parking");
        
    }

    @Override
    void stramingServices() {
        // TODO Auto-generated method stub
        System.out.println("SUV stramingServices");
        
    }
    
}
