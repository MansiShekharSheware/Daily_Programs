import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        // Declare variables
        double radius;
        double area, circumference;

       
        Scanner sc = new Scanner(System.in);

        // Inputs 
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        // Calculate area and circumference
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        // Display 
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        sc.close();
    }
}