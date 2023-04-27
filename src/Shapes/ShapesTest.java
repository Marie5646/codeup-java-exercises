package Shapes;



public class ShapesTest {


    public static void main(String[] args) {


        Measurable shapeOne = new Square(9);
        Measurable shapeTwo = new Rectangle(9, 10) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };


        System.out.println(shapeOne);
        System.out.println(shapeTwo);
    }
}