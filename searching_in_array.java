import java.util.Scanner;

public class searching_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to search:");
        int n = input.nextInt();
        
        int[] arr = {45, 23, 86, 13, 74, 200, 37, 148};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;  // no need to continue the loop after finding
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }

        input.close();
    }
}





