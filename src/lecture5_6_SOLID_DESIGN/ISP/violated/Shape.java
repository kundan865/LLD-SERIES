package lecture5_6_SOLID_DESIGN.ISP.violated;

// Single interface for all shapes (Violates ISP)
public interface Shape {
    double area();
    double volume(); // 2D shapes don't have volume!
}
