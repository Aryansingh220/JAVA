import java.util.Scanner;
public class perimeter_of_rectangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of rectangle :");
        double l=input.nextDouble();
        System.out.println("enter the breath of rectangle :");
        double b=input.nextDouble();
        double c=2*(l+b);
        System.out.println("the perimeter of rectangle is:" + c);


    }
    
}
