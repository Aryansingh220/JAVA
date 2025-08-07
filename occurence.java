import java.util.Scanner;
public class occurence {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int []arr={34,56,13,34,78,90,45,34,45,34,133,34,900,67,34,5677,34,67,34,};
        int count=0;
        
        System.out.println("enter the number to be search:");
        int n=input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count=count+1;
                System.out.println(count);
 
            }
           
        }

    }
    
}
