public class Circle {
    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getCircutference(){
        return Math.PI*2*radius;
    }
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}
