public class A6_SortedMatrix {

    public static boolean stairCaseSearch(int matrix[][] , int key){

        int row = 0 , col =matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("KEY FOUND AT (" + row +" , " + col + ")");
                return true;

                
            }
            else if (key < matrix[row][col]) {
                col--;
                
            }
            else{
                row++;
            }

            
        }
        System.out.println("KEY NOT FOUND");
        return false;

        }
    public static void main(String[] args) {
        int matrix [] [] ={{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,49},
                           {32,33,39,50}};
        int key = 33;
        stairCaseSearch(matrix, key);
    }
    
}