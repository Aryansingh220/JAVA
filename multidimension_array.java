public class multidimension_array {
    public static void main(String[] args){
        int [][] arr=new int[2][3];
        arr[0][0]=34; 
        arr[0][1]=456;
        arr[0][2]=89;
        arr[1][0]=56;
        arr[1][1]=690;
        arr[1][2]=567;
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr.length;j++){

        
        System.out.println(arr[i][j]);
        
            }
    }
}
}
