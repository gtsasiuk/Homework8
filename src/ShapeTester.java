public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        Shape rectangle = new Rectangle(4, 6);
        Shape ellipse = new Ellipse(5, 3);

        ShapePrinter printer = new ShapePrinter();

        printer.printShapeName(circle);
        printer.printShapeMeasurements((Measurable) circle);
        printer.printShapeName(square);
        printer.printShapeMeasurements((Measurable) square);
        printer.printShapeName(triangle);
        printer.printShapeMeasurements((Measurable) triangle);
        printer.printShapeName(rectangle);
        printer.printShapeMeasurements((Measurable) rectangle);
        printer.printShapeName(ellipse);
        printer.printShapeMeasurements((Measurable) ellipse);
    }
}
