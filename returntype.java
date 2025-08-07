import java.util.Scanner;
public class returntype {
     // Function that returns the sum of two integers
    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // returning the result
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int result = add(num1, num2); // calling the function with user input
        System.out.println("The sum is: " + result); // printing the result

       
    }
}

    

