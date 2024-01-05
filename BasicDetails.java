import java.util.Scanner; // Import the Scanner class

class BasicDetails {
    public static void main(String[] args) {

        int id;
        String name;
        int age;
        char gender;
        String address;
        float weight;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your ID");
        id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Your name");
        name = sc.nextLine();
        
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter Your gender M/F");
        gender = sc.next().charAt(0);

        sc.nextLine(); 

        System.out.println("Enter Your Address");
        address = sc.nextLine();

        System.out.println("Enter Your weight");
        weight = sc.nextFloat();

        // Display the values
        System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nGender: " + gender + "\nAddress: " + address + "\nWeight: " + weight);

        sc.close(); 
    }
}