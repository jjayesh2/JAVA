//brute force

public class A5_SortedMatrix {

    public static void search(int[][] matrix , int key){
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                System.out.println("found at :- " +i + " " + j);                    
                }
                
            }
            
        }


    }
    public static void main(String[] args) {
        int matrix [] [] ={{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
     int key=16;

    search(matrix, key);
    }
    
}
