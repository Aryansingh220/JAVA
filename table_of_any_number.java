import java.util.Scanner;
public class table_of_any_number {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n + "x" + i + "="+(n*i));
            i=i+1;

        }
    }
    
}
