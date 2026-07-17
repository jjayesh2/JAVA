//!KADANE's ALGORITHM (OPTIMIZED CODE)
//?IF WE ADD 2 BIG POSITIVE INTEGERS THEN THE SUM IS POSITIVE 
//?IF WE ADD ONE BIG POSITIVE AND ONE SMALL NEGATIVE THEN ALSO IT IS POSITIVE SUM 
//! BUT WHEN WE ADD ONE BIG NEGATIVE AND SMALL POSITIVE INTEGER THEN THE SUM IS NEGATIVE
/// SO KADANE RECOGNIZE THIS..
// !AND IDENTIFY THAT TAKING FINAL SUM AS NEGATIVE INTEGER LETS TAKE IT ZERO
// .... DON'T CONSIDER THAT NEGATIVE...BECAUSE IT WILL REDUCE FUTURE SUM
// ?ONE BY ONE RUN RUN THE SINGLE LOOP ,, ONE BY ONE JUMP ON ELEMENTS ,,,FIND
// CURRENT SUM AND MAX SUM
// ! TIME COMPLEXITY O(n) good time complexity ....................

public class A3_MaxSub_Arrays {

    public static void kadanes(int numbers[]) {
        int MaxSum = Integer.MIN_VALUE;
        int Current_Sum = 0;

        for (int i =0; i < numbers.length; i++) {
            Current_Sum += numbers[i];




            // if (Current_Sum > MaxSum) {
            //     MaxSum =Current_Sum;
                
            MaxSum = Math.max(MaxSum, Current_Sum);
            // }
            if (Current_Sum < 0) {
                Current_Sum = 0;

            }
        }

        System.out.println("THE MAXIMUM SUM OF THE FOLLLOWING ARRAY IS " + MaxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, -3, 1, -2,  3 };
        kadanes(numbers);

    }

}