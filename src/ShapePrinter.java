public class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }

    public void printShapeMeasurements(Measurable measurable) {
        System.out.println("Area: " + measurable.calculateArea());
        System.out.println("Perimeter: " + measurable.calculatePerimeter());
    }
}
