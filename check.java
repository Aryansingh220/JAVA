import java.util.Scanner;
public class check  {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=input.nextInt();
        if(x==0){
            System.out.println("the number is equal to :0");
        }
        else if(x<0){
            System.out.println("the number is nagative");

        }
        else{
            System.out.println("the number is positive");
        }

           

        }
    }
    

