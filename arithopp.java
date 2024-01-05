// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner; // Import the Scanner class

class arithopp {
    public static void main(String[] args) {
        int num1;
        int num2;
        int add , sub , mul;
        float div ;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        
        num1=sc.nextInt();
        System.out.println("Enter numbers");

        num2=sc.nextInt();
        
        add = num1 + num2;
        sub = num1 - num2;
        mul = num1*num2;
        div = num1/num2;
        System.out.println("Addition ="+add );
        System.out.println("Subtraction ="+sub );
        System.out.println("multiplication ="+mul );
        System.out.println("Division ="+div );
        

    }
}

