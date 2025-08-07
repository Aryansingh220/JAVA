import java.util.Scanner;
public class swapping  {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=input.nextInt();
        System.out.println("enter the value of y:");
        int y=input.nextInt();
        int c=y;
        y=x;
        x=c;
        System.out.println("value of x after the swapping :" + x);
        System.out.println("value of y after the swapping :" + y);





    }
    
}
