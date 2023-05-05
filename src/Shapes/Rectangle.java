package Shapes;
import Shapes.Measurable;
import Shapes.Quadrilateral;

public class Rectangle extends Quadrilateral implements Measurable {




    public Rectangle(double Width, double Length) {
        super(Width, Length);
    }

    @Override
    public void setLength(double length) {
            this.length=length;
    }

    @Override
    public void setWidth(double width) {
        this.width=width;
    }



    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return  2 * length + 2 * width;

    }
}
