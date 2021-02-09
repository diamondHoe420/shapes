public class Circle extends Shape {
    protected double radius = 1d;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius="+this.radius+", color=" + this.getColor() + ", filled=" + this.getColor() + "]";
    }
}
