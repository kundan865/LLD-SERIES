package lecture5_6_SOLID_DESIGN.ISP.follwed;

// Cube implements the 3D interface
public class Cube implements ThreeDimensionalShape {

    private final double side;

    public Cube(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
