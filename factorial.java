import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=input.nextInt();
        int fact=factorial(num);
        System.out.println("the factorial of number is :" + fact);


    }
    public static int factorial(int num){
        if(num<2){
          return 1;
        }
        int fact=1;
        int i=2;
        while(i<=num){
            fact=fact*i;
            i++;

        }
        
        
        return fact;

    }
}
