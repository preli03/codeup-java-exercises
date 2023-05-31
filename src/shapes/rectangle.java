package shapes;

public abstract class rectangle extends Quadrilateral{
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    pubilc rectangle(int, length, int width);
}

}
    private double width;
    private double length;

    public rectangle(double length, double width) {
        super();
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    protected int getLength() {
        return 0;
    }

