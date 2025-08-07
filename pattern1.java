import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=input.nextInt();
        
        for(int i=1;i<=n;i++){
            for( i=1;i<=n;i++){
                System.out.println("*");
            }
            System.out.println();
            
        }
    }
}
