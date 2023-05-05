package Shapes;

import java.awt.*;
import java.util.PropertyResourceBundle;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;



    public Quadrilateral(double width, double length){
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double width);



 

}
