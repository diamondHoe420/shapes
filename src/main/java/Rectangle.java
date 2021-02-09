public class Rectangle extends Shape {
    private double width = 1d;
    private double height = 1d;

    public Rectangle() {
        super();
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*width+2*height;
    }

    public String toString() {
        return "Rectangle[width="+getWidth()+", height="+getHeight()+", color=" + getColor()+ ", filled=" + isFilled() + "]";
    }
}
