public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    public double getHeight() {
        return getWidth();
    }

    public void setHeight(double height) {
        this.setWidth(height);
        this.setHeight(height);
    }

    public double getWidth() {
        return getWidth();
    }

    public void setWidth(double width) {
        this.setWidth(width);
        this.setHeight(width);
    }

    public String toString() {
        return "Square[side="+ this.getWidth() +", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}