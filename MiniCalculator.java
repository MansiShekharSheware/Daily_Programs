package demojava.lab4;

import java.util.Scanner;

class MiniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Choose an operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));

        scanner.close();
    }
}

