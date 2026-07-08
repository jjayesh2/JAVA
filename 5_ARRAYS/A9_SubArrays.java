//?NESTED LOOPS.........................

//!  PRINT SUB ARRAYS OF {2, 4, 6, 8, 10}
//!(2) (2,4) (2,4,6) (2,4,6,8) (2,4,6,8,10)

public class A9_SubArrays {

    public static void subarrays(int numbers[]){
        int ts=0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum =0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = numbers[k] + sum ;
                    
                }
                
                System.out.println(sum);
                ts++;
                System.out.println();
                
            }
            System.out.println();
            System.out.println("total subarrays are " + ts);
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
       subarrays(numbers);
    }
    
}
