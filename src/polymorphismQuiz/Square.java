package polymorphismQuiz;

public class Square extends Shape {
    private double side;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
