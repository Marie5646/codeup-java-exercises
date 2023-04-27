package Shapes;

import java.awt.*;
import java.util.PropertyResourceBundle;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double Length;
    protected double Width;


    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public Quadrilateral(double Width, double Length){
     this.Length = Length;
     this.Width = Width;

   }

 

}
