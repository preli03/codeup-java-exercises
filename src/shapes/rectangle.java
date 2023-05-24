package shapes;

public class rectangle {
        protected double length;
        protected double width;
        //constructor rectangle has protected properties

    // v this accepts two numbers for the length and width and sets properties
        public rectangle(double length , double width ){
            this.length = length;
            this.width = width;
        }



        //vv code for two methods on this class rectangle, getters
        public double getArea(){
            return length * width;

        }

        public double getPerimeter(){
            return 2 * (length + width);
        }

    }
