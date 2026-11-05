package lecture5_6_SOLID_DESIGN.ISP.follwed;

// Square implements only the 2D interface
public class Square implements TwoDimensionalShape {
    private double side;

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        return side * side;
    }
}
