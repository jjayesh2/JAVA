public class A4_Counting_Sort{

    public static void Counting(int array[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i < array.length-1; i++) {
            largest = Math.max(largest, array[i]);

        }

        int[] count = new int[largest+1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
            
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
                
            }
            
           
            

        }

    }
        public static void printl(int array[]){
            for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                    
            }

    }
    public static void main(String[] args) {
        int array[] ={1,4,1,2,3,7,3};
        Counting(array);
        printl(array);
        
    }
}