package demojava.lab4;
import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Student " + (i + 1) + " Details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();

            students[i] = new Student(id, name, gpa);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
