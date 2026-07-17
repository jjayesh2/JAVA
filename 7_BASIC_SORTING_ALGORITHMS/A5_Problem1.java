public class A5_Problem1 {
    public static void BubbleSort(int array[]){

        for (int turns = 0; turns < array.length-1; turns++) {
            for (int i = 0; i < array.length-1-turns; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] =array[i+1];
                    array[i+1] = temp;
                    
                }
            }
        }

    }
    public static void print(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int array[] = {2,5,4,7,3,1};
        BubbleSort(array);
        print(array);
        
    }
    
}
