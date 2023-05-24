package shapes;

public class ShapesTest {
    public static void main(String[] args){
        rectangle venue = new rectangle(20, 30);
        System.out.println("rectangle venue");
        System.out.println("Venue Perimeter: = " + venue.getPerimeter());
        System.out.println("Area: "+ venue.getArea());

        rectangle venue2 = new Square(60);
        System.out.println("rectangle venue2");
        System.out.println("Venue2 Perimeter: " + venue2.getPerimeter());
        System.out.println("Venue2 Area:" + venue2.getArea());


    }
}
