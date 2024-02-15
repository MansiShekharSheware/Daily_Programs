package demojava.lab4;

class Employee {
    void display() {
        System.out.println("Employee Information");
    }
}

class Faculty extends Employee {
    // Overriding the display method in the Faculty class
    @Override
    void display() {
        System.out.println("Faculty Information");
    }
}

public class FacultyInformation {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.display();
    }
}

