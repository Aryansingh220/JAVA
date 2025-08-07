public class minimum {
    public static void main(String[] args){
            int []arr={5,689,3,456,54,345};
            int min=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(min<arr[i]){
                    min=arr[i];
                }
            }
           
            System.out.println(min);
        }
       
    }
    
    

