package lecture5_6_SOLID_DESIGN.ISP.violated;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width  = w;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Volume not applicable for Rectangle"); // Unnecessary method
    }
}
