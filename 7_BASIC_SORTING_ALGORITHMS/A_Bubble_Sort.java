//!OPTIMIZED BUBBLE SORT



public class A_Bubble_Sort {
    public static void BubbleSort(int array[]){
        for (int turns = 0; turns < array.length-1; turns++) {
            boolean swap = false;
            for (int j = 0; j < array.length-1-turns; j++) {

                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = array[j];

                    swap=true;

                    
                }
                
            }
            if (swap==false) {
                break;
                
            }
            
        }

    }
    public static void main(String[] args) {
        
    }
    
}
