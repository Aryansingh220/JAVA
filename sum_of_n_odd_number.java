import java.util.Scanner;
public class sum_of_n_odd_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many odd numbers to sum:");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("Sum of first " + num + " odd numbers is: " + sum);
    }

    public static int oddsum(int num) {
        int sum = 0;
        int i = 1;
        int count = 0;

        while (count < num) {
            sum = sum + i;
            i = i + 2;
            count++;
        }

        return sum;
    }
}


