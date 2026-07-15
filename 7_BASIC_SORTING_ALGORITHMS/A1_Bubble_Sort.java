public class A1_Bubble_Sort{
    public static void BubbleSort(int array[]){
        for (int turns = 0; turns < array.length-1; turns++) {
            for (int i = 0; i < array.length-1-turns; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    
                }
                
            }
            
        }
         

    }
    public static void main(String[] args) {

        int array[] = {2,1,5,4,3};

        BubbleSort(array);        

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}