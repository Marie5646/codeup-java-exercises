package Shapes;
import Shapes.Measurable;
import Shapes.Quadrilateral;

public abstract class Rectangle extends Quadrilateral implements Measurable {

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    public Rectangle(double Width, double Length) {
        super(Width, Length);
    }


}
