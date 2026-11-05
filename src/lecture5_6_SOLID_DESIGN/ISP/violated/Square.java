package lecture5_6_SOLID_DESIGN.ISP.violated;

// Square is a 2D shape but is forced to implement volume()
public class Square implements Shape {
    private double side;

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Volume not applicable for Square"); // Unnecessary method
    }
}
