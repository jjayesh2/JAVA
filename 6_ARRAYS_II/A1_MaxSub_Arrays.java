//! 3 NESTED LOOPS ARE USED IN THIS PROGRAM WHICH ARE GOING TO (n)..........
//!  SO THE TIME COMPLEXITY WILL BE O(n³) WHICH IS WORST TIME COMPLEXITY
//! BUT IT WAS BRUTE FORCE MEANs,, BASIC SOLUTION, WAS THIS.....................
  
public class A1_MaxSub_Arrays {

    public static void MaxSub(int numbers[]){
        int MaxSum =Integer.MIN_VALUE;
        int Current_Sum =0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i ;
            for (int j = i; j < numbers.length; j++) {
                int end =j;
                Current_Sum=0;
                for (int k = start ; k <= end; k++) {
                    Current_Sum += numbers[k];

                    System.out.println("SUB ARRAY:- " +numbers[k]);
                }
                if (MaxSum < Current_Sum) {
                    MaxSum = Current_Sum;
                    
                }
                
            }

            System.out.println("MAXIMUM SUM OF ARRAY IS :- " + MaxSum );

        }
    }

    public static void main(String[] args) {
        int numbers[] = {1 ,-2, 6, -1, 3};

        MaxSub(numbers);

        
    }
    
}
