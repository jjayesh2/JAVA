public class A9_Assignment {

    public static void transpose(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;


        int transpose[][] = new int[n][m];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                 transpose[j][i] =  matrix [i][j];
                
            }
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 System.out.print(transpose[i][j]);
                
            }
            System.out.println();
            
        }
    }





   
    public static void main(String[] args) {
        int matrix[][] = { {4,7,8},{8,8,7} };
        transpose(matrix);
    }
    
}
