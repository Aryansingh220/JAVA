import java .util.Scanner;
public class prime_number {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=input.nextInt();
        int i=2;
        while(i<n){
          if(n%i==0){
            System.out.println("the " +n+ " is not prime number");
          }
          else{
            System.out.println("the " +n+ " is prime number");

          }
          

          
          i++;
        }
       

    }
  
    
}
