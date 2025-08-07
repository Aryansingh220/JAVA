import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int sum = sumofdigits(num);
        System.out.println("The sum of digits is: " + sum);
        input.close();
    }

    public static int sumofdigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}

    

