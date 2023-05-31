package shapes;

public class Square extends rectangle {


    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.getLength();
    }

    @Override
    public double getArea() {
        double side = super.getLength();
        return Math.pow(side, 2);
    }
    public Square(double side) {
        super(side, side);
    }
}