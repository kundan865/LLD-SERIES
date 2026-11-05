package lecture5_6_SOLID_DESIGN.ISP.follwed;

// Rectangle implements only the 2D interface
public class Rectangle implements TwoDimensionalShape {
    private double length, width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width  = w;
    }

    @Override
    public double area() {
        return length * width;
    }
}
