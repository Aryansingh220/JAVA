import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(year%4==0 || year%400==0){
            System.out.println("the year is leapyear");
        }
        else if(year%100!=0){
            System.out.println("the year is not leapyear");

        }
        else{
            System.out.println("the year is not leapyear");
        }

        }

        // single line comments



        /*multiple line 
         comments */
         



    }

