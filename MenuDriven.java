package demojava;
import java.util.Scanner;

public class MenuDriven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1: Given no is even or odd");
        System.out.println("2: Find out the grade (accept marks of 5 subjects)");
        System.out.println("3: Accept no. and find out cube if no. is divisible by 5");
        System.out.println("4: Accept 3 numbers from the user and find out the greatest");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("The given number is even.");
                } else {
                    System.out.println("The given number is odd.");
                }
                break;

            case 2:
                int totalMarks = 0;
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Enter marks for subject " + i + ": ");
                    totalMarks += scanner.nextInt();
                }
                int averageMarks = totalMarks / 5;
                if (averageMarks >= 90) {
                    System.out.println("Grade: A");
                } else if (averageMarks >= 80) {
                    System.out.println("Grade: B");
                } else if (averageMarks >= 70) {
                    System.out.println("Grade: C");
                } else {
                    System.out.println("Grade: D");
                }
                break;

            case 3:
                System.out.print("Enter a number: ");
                int inputNum = scanner.nextInt();
                if (inputNum % 5 == 0) {
                    int cube = inputNum * inputNum * inputNum;
                    System.out.println("Cube of the number (divisible by 5): " + cube);
                } else {
                    System.out.println("The number is not divisible by 5.");
                }
                break;

            case 4:
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                System.out.print("Enter the third number: ");
                int num3 = scanner.nextInt();

                int max = num1;
                if (num2 > max) {
                    max = num2;
                }
                if (num3 > max) {
                    max = num3;
                }

                System.out.println("The greatest number is: " + max);
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

        scanner.close();
    }
}
