package shapes;

public class Square extends Quadlilateral {


    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
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
        super();
    }
}