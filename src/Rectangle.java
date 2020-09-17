public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width,double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        String str =
                "Rectangle with width= "
                + width
                + ", length= "
                + length
                + " which is a subclass of "
                + super.toString();
        return str;
    }

    @Override
    public void Resize(double percent) {
        setLength(getLength()+getLength()*percent/100);
        setWidth(getWidth()+getWidth()*percent/100);
    }
}
