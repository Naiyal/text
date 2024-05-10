package first;

/**
 * Car
 */
public abstract class Car {

   float height;
   float weight;
   int number;

   abstract void  autopilot();
   abstract void  stramingServices();
   abstract void  parking();

   public void setHeight(float height) {
       this.height = height;
   }
   public void setNumber(int number) {
       this.number = number;
   }
   public void setWeight(float weight) {
       this.weight = weight;
   }
   public float getHeight() {
       return height;
   }
   public int getNumber() {
       return number;
   }
   public float getWeight() {
       return weight;
   }
   Car(){}

   public Car (float height,float weight,int number){
       this.height=height;
       this.number=number;
       this.weight=weight;
   }
}