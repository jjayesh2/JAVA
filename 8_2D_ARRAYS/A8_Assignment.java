public class A8_Assignment{
    public static void add(int matrix[][]){

        int sum =0 ;  
        int row =1;

        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[row][i];
            
        }
       
      System.out.println(sum);
    }
 
        
    
    public static void main(String[] args) {
         int matrix[][]= { {4,7,8},{8,8,7},{2,5,6} };
         add(matrix);
        
    }
}