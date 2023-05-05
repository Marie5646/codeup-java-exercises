package Shapes;

public class Square extends Quadrilateral{
//public double side;

public Square(double length){
    super(length,length);
}


//    @Override
//    public double getArea() {
//        return Math.pow(side,2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }

    @Override
    public void setLength(double length) {
            this.length=length;
            this.width=length;
    }

    @Override
    public void setWidth(double width) {
        this.length=width;
        this.width=width;
    }

    @Override
    public double getArea() {
        return 4 * length;
    }

    @Override
    public double getPerimeter() {
        return  2 * length + 2 * width;
    }
}
