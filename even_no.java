import java.util.Scanner;
public class even_no {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=input.nextInt();
        if(x%2==0){
            System.out.println("the number is even");

        }
        else{
            System.out.println("the number is odd");
        }
        
        
    }
    
}
