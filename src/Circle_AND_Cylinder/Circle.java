package Circle_AND_Cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAcreage() {
        return Math.pow(radius,radius)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{"  +
                "bán kính=" + radius + "diện tích hình tròn" + getAcreage()+
                '}';
    }

}
