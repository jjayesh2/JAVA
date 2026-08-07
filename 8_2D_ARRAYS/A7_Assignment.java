public class A7_Assignment {
    public static void search(int matrix[][] , int key){
        int frequency =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    frequency++;
                    
                    
                }
            }
            
        }
        System.out.println(frequency);

        
    }
    public static void main(String[] args) {
        int matrix[][]= { {4,7,8},{8,8,7} };
        int key=8;
        search(matrix, key);
        
    }
    
}
