public class sum_od_diagonal {
    public static void main(String[] args){
        int [][]mat={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
    int sum=0;                 
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            if(i==j){
                sum=sum+mat[i][j];
            }
           

            

        }
    }
    System.out.println("the sum of elements of princple diagonal axis is:"+sum);                 

    }
    
}
