public class sum_of_2matrix {
    public static void main(String[] args){
        int[][]mat1={{2,3,4},{9,6,3}};
        int[][]mat2={{7,4,6,},{9,0,3}};
        int[][]result={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
               
                result[i][j]=mat1[i][j]+mat2[i][j];

            }
         
        }
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.println(result[i][j] + " ");
                result[i][j]=mat1[i][j]+mat2[i][j];

    }
    System.out.println(" ");
    
}
}}
