package Shapes;

public class Square extends Quadrilateral{
public double side;

public Square(double length){
    super(length,length);
}


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}
