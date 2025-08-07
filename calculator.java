import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1=input.nextInt();
        System.out.println("enter the second number :");
        int num2=input.nextInt();
         int c=num1+num2;
         int a=num1-num2;
         int x=num1*num2;
         double v=num1/num2;
        System.out.println("the addition of two number is :" +  c);
        System.out.println("the subtraction of two number is :" +  a);
        System.out.println("the multiply of two number is :" +  x);
        System.out.println("the division of two number is :" +  v);






    }

    
}
