package Shapes;

import java.util.concurrent.Callable;

public class Circle {
    private double radius;

    public Circle(double aDouble) {
    }


    public double Circle(double radius) {
        return this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(this.radius,2));

    }

    public double getCircumfrence(){
        return 2 * Math.PI * this.radius;
    }


}
