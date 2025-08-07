public class maximum_element {
    public static void main(String[] args){
        int []arr={5,689,3,456,54,345};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
       
        System.out.println(max);
    }
   
}
