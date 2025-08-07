public class average {
    public static void main(String[] args){
        int []arr={46,68,23,876,345,98,123,67};
        int sum=0;
        for(int i=0;i<=7;i++){
            sum=sum+arr[i];
        }
        double avg=sum/(arr.length);
        System.out.println(avg);
    }
    
}
