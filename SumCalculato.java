package demojava.lab4;

import java.util.Scanner;

class SumCalculator {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intNum = scanner.nextInt();

        System.out.print("Enter another integer: ");
        int intNum2 = scanner.nextInt();

        System.out.println("Sum of integers: " + sum(intNum, intNum2));

        System.out.print("Enter a decimal number: ");
        double doubleNum = scanner.nextDouble();

        System.out.print("Enter another decimal number: ");
        double doubleNum2 = scanner.nextDouble();

        System.out.println("Sum of decimals: " + sum(doubleNum, doubleNum2));

        scanner.close();
    }
}

