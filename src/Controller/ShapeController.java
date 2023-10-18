package Controller;

import java.util.Scanner;
import Model.Circle;
import Model.Rectangle;
import Model.Shape;
import Model.Triangle;
import View.ShapeView;

public class ShapeController {

    private Scanner scanner;

    public ShapeController() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=====Calculator Shape Program=====");
        double width = getInput("Please input side width of Rectangle: ");
        double length = getInput("Please input length of Rectangle: ");
        Shape rectangle = new Rectangle(width, length);

        double radius = getInput("Please input radius of Circle: ");
        Shape circle = new Circle(radius);

        double sideA = getInput("Please input side A of Triangle: ");
        double sideB = getInput("Please input side B of Triangle: ");
        double sideC = getInput("Please input side C of Triangle: ");
        Shape triangle = new Triangle(sideA, sideB, sideC);

        System.out.println("-------Rectangle-----");
        ShapeView.displayShapeInfo(rectangle);
        System.out.println("-------Circle--------");
        ShapeView.displayShapeInfo(circle);
        System.out.println("-------Triangle------");
        ShapeView.displayShapeInfo(triangle);
        scanner.close();
    }

    public static void main(String[] args) {
        ShapeController controller = new ShapeController();
        controller.run();
    }

    private double getInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double result = Double.parseDouble(scanner.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}

