public class A2_Selection_Sort {
    public static void SelectionSort(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                    
                }
                
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            
        }
      
    }
    public static void main(String[] args) {
        int array[] = {5, 4, 1, 3, 2};
        SelectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
