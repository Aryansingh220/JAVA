import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number:");
        int first=input.nextInt();
        System.out.println("enter the second number:");
        int second=input.nextInt();
        int lcm=lowestcommonfactor(first,second);
        System.out.println("the lowest common factor is :" + lcm);



    }
    public static int lowestcommonfactor(int first,int second){
        int i=1;
        while(i<=second){
            int factor=first*i;
            if(factor%second==0){
                return factor;
            }
            i++;

        }
        return 0;

    }
}
        
       