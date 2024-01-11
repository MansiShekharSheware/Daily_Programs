//WAP to accept a choice from the user and accordingly display the output
//1:Accept no anc check it is prime no or Not
//2:Accept no and find out the SUM OF DIGIT (123 =1+2+3 =6)
//3:Accept a no from the user and  display the fibonacci series(0 1 1 2 3 5 .....)
//4:Accept no from user and check it is armstrong or not
//5: Accept 5 no and find out the greatest
//6:Accept a no from the user and display the month name
//5:Accept choice from user and create CALC


package demojava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		while(true)
		{
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Choice:");
		System.out.println("1. Check if a no. is prime");
		System.out.println("2. Find the sum of digits of a number");
		System.out.println("3. Generate Fibonacci Series");
		System.out.println("4. Check if a no. is an Armstrong number");
		System.out.println("5. Find the greatest of five numbers");
		System.out.println("6. Display the month name");
		System.out.println("7. Perform Calc");
		
		
		
		choice = sc.nextInt();
		
		
		
		switch (choice) {
		case 1:                        // Check if a no. is prime
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();
            boolean isPrime = true;
            for (int i = 2; i <= num1 / 2; i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num1 + " is a prime number.");
            } else {
                System.out.println(num1 + " is not a prime number.");
            }
            break;
        case 2:                         // Find the sum of digits of a number
            System.out.print("Enter a number: ");
            int num2 = sc.nextInt();
            int sum = 0;
            int originalNum2 = num2;          //to display in output
            while (num2 > 0) {
                sum += num2 % 10;
                num2 /= 10;
            }
            System.out.println("The sum of digits of " + originalNum2 + " is " + sum + ".");
            break;
            
            
        case 3:                        // Generate Fibonacci Series
        	System.out.println("Enter the number of terms in the Fibonacci series:");
        	int num3 = sc.nextInt();
        	int n1 = 0, n2 = 1, n31;
            System.out.print("Fibonacci Series: ");
            for (int i = 1; i <= num3; i++) {
                System.out.print(n1 + " ");
                n31 = n1 + n2;
                n1 = n2;
                n2 = n31;
            }
            System.out.println();
            break;
        case 4:                     //Check if a no. is an Armstrong number
        	
        	System.out.println("Enter Number:");
        	
        	int num4 = sc.nextInt();
        	int number, temp, total = 0;

            number = num4;
            while (number != 0)
            {
                temp = number % 10;
                total = total + temp*temp*temp;      
                number /= 10;
            }

            if(total == num4)
                System.out.println(num4 + " is an Armstrong number");
            else
                System.out.println(num4 + " is not an Armstrong number");
            break;
		
	   case 5:                           //Find the greatest of five numbers
		   
            System.out.print("Enter five numbers separated by spaces:");
            int num5 = sc.nextInt();
            int max = num5;
            for (int i = 1; i < 5; i++) {
                num5 = sc.nextInt();
                if (num5 > max) {
                    max = num5;
                }
            }
            System.out.println("The greatest of the five numbers is " + max + ".");
            break;
            
	   case 6:                                //Display the month name
		   
		   System.out.print("Enter a month number (1-12): ");
           int num6 = sc.nextInt();
           String monthName = "";
           switch (num6) {
           case 1:
               monthName = "January";
               break;
           case 2:
               monthName = "February";
               break;
           case 3:
               monthName = "March";
               break;
           case 4:
               monthName = "April";
               break;
           case 5:
               monthName = "May";
               break;
           case 6:
               monthName = "June";
               break;
           case 7:
               monthName = "July";
               break;
           case 8:
               monthName = "August";
               break;
           case 9:
               monthName = "September";
               break;
           case 10:
               monthName = "October";
               break;
           case 11:
               monthName = "November";
               break;
           case 12:
               monthName = "December";
               break;
           default:
               System.out.println("Invalid month number.");
               break;
       }

       if (!monthName.isEmpty()) {
           System.out.println("Month: " + monthName);
       }
      break;
      
      
	   case 7:                                  // Perform Calculator

		           System.out.println("Choose an operation:");
		           System.out.println("1: Addition");
		           System.out.println("2: Subtraction");
		           System.out.println("3: Multiplication");
		           System.out.println("4: Division");

		           int ch = sc.nextInt();

		           System.out.print("Enter the first number: ");
		           double num7 = sc.nextDouble();

		           System.out.print("Enter the second number: ");
		           double num8 = sc.nextDouble();

		           double result = 0;

		           switch (ch) {
		               case 1:
		                   result = num7 + num8;
		                   System.out.println("Result: " + result);
		                   break;
		               case 2:
		                   result = num7 - num8;
		                   System.out.println("Result: " + result);
		                   break;
		               case 3:
		                   result = num7 * num8;
		                   System.out.println("Result: " + result);
		                   break;
		               case 4:
		                   if (num8 != 0) {
		                       result = num7 / num8;
		                       System.out.println("Result: " + result);
		                   } else {
		                       System.out.println("Cannot divide by zero.");
		                   }
		                   break;
		               default:
		                   System.out.println("Invalid choice.");
		           }

	   case 8:
           System.out.println("Exiting the program.");
           System.exit(0);
           break;

       default:
           System.out.println("Invalid choice. Please choose again.");
   }      
		       }
		   }    	
        			
        			
	}
