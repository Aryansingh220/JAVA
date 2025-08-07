public class check_array_sorted {
    public static void main(String[] args){
        int []arr={34,67,33,58,12,6,8};
        boolean found=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("the array is not sorted !");
                found =false;
                break;
            }
            else{
                System.out.println("the array is sorted !");
            }
        }
    } 
    
}
