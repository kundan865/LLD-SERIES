package lecture5_6_SOLID_DESIGN.ISP.violated;

// Cube is a 3D shape, so it actually has a volume
public class Cube implements Shape {
    private double side;

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
