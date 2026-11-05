package lecture5_6_SOLID_DESIGN.ISP.follwed;


public class ISPFollowed {
    public static void main(String[] args) {

        TwoDimensionalShape square    = new Square(5);
        TwoDimensionalShape rectangle = new Rectangle(4, 6);

        ThreeDimensionalShape cube     = new Cube(3);

        System.out.println("Square Area: "    + square.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Cube Area: "      + cube.area());
        System.out.println("Cube Volume: "    + cube.volume());
    }
}