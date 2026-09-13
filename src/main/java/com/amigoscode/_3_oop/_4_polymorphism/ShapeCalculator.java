package com.amigoscode._3_oop._4_polymorphism;

import com.amigoscode._3_oop._3_abstractclasses.Circle;
import com.amigoscode._3_oop._3_abstractclasses.Rectangle;
import com.amigoscode._3_oop._3_abstractclasses.Shape;

import java.util.List;

/**
 * Exercise: Polymorphism - Shape Calculator
 * <p>
 * Use polymorphism to write methods that work with any Shape.
 * Because Circle and Rectangle both extend Shape, a single method
 * can handle both — and any future Shape subclass — without modification.
 * <p>
 * Key concepts:
 * - Methods that accept a supertype parameter
 * - Polymorphic collections (List<Shape>)
 * - instanceof with pattern matching (Java 16+)
 * - Open/closed principle in practice
 * <p>
 * Prerequisites: Complete Shape.java, Circle.java, and Rectangle.java first.
 */
public class ShapeCalculator {

    // TODO: 1 - Create a method: void printShapeArea(Shape shape)
    //   Print: "The <className> has an area of <area>"
    //   Use shape.getClass().getSimpleName() to get the class name.
    //   Use String.format("%.2f", shape.area()) for formatting.
    void printShapeArea(Shape shape) {
        System.out.println("The " + shape.getClass().getSimpleName() + " has an area of " + String.format("%.2f", shape.area()));
    }


    // TODO: 2 - Create a method: double totalArea(List<Shape> shapes)
    //   Iterate over all shapes and return the sum of their areas.
    double totalArea(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }


    // TODO: 3 - Create a method: Shape largestShape(List<Shape> shapes)
    //   Return the shape with the largest area.
    //   If the list is empty, return null.
    Shape largestShape(List<Shape> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }
        Shape largestShape = shapes.getFirst();
        double largestArea = largestShape.area();
        for (int i = 1; i < shapes.size(); i++) {
            Shape currentShape = shapes.get(i);
            double currentArea = currentShape.area();
            if (largestArea < currentArea) {
                largestArea = currentArea;
                largestShape = currentShape;
            }
        }
        return largestShape;
    }


    // TODO: 4 - Create a method: String describeShape(Shape shape)
    //   Use instanceof with pattern matching (Java 16+) to return
    //   specific descriptions:
    //   - If shape is a Circle c: return "Circle with radius info"
    //     (just return "Circle detected with area: " + c.area())
    //   - If shape is a Rectangle r: return "Rectangle detected with area: " + r.area()
    //   - Otherwise: return "Unknown shape with area: " + shape.area()
    String describeShape(Shape shape) {
        if (shape instanceof Circle circle) {
            return "Circle detected with area: " + circle.area();
        }
        if (shape instanceof Rectangle rectangle) {
            return "Rectangle detected with area " + rectangle.area();
        }
        return "Unknown shape with area: " + shape.area();
    }


    // TODO: 5 - Create a method: String formatSummary(List<Shape> shapes)
    //   Return a formatted summary string like:
    //   "Summary: <N> shapes, total area: <totalArea>, largest area: <largestArea>"
    //   Use the totalArea() and largestShape() methods you already wrote.
    String formatSummary(List<Shape> shapes) {
        Shape largestShape = largestShape(shapes);
        double largestArea = largestShape == null ? 0.0 : largestShape.area();

        return "Summary: " + shapes.size()
                + " shapes, total area: " + totalArea(shapes)
                + ", largest area: " + largestArea;
    }


    // TODO: 6 - In main, create a List<Shape> with at least two Circles
    //   and two Rectangles. Call all the methods above and print results.
    //   This demonstrates polymorphism: the same method handles
    //   different shape types seamlessly.

    public static void main(String[] args) {
        // Complete TODO 6 here.
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(4, 6);
        List<Shape> shapes = List.of(circle1, circle2, rectangle1, rectangle2);
        for (Shape shape : shapes) {
            shapeCalculator.printShapeArea(shape);
        }
        System.out.println(shapeCalculator.largestShape(shapes));
        System.out.println(shapeCalculator.totalArea(shapes));
        System.out.println(shapeCalculator.describeShape(rectangle1));
        System.out.println(shapeCalculator.formatSummary(shapes));


    }
}
