import java.util.Scanner;
public class area_of_triangle { 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of triangle :");
        double l=input.nextDouble();
        System.out.println("enter the breath of triangle :");
        double b=input.nextDouble();
        double c=(l*b)/2;
        System.out.println("the area of triangle is:" + c);


    }
    
}