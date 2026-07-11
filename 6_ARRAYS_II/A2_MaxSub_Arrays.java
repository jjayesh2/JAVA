//! MAXIMUM SUBARRAY SUM METHOD 2 (PREFIX SUM)
//! 2 NESTED LOOPS ARE USED IN THIS PROGRAM WHICH ARE GOING TO (n)..........
//!  SO THE TIME COMPLEXITY WILL BE O(n²)  WHICH IS MEDIUM TIME COMPLEXITY
public class A2_MaxSub_Arrays {

  public static void MaxSubarrays(int numbers[]) {

    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];
    // CALCULATE PREFIX ARRAY
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + numbers[i];

    }

    int MaxSum = Integer.MIN_VALUE;
    int Sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      int Start = i;
      for (int j = 0; j < numbers.length; j++) {
        int end = j;

        if (Start == 0) {
          Sum = prefix[end];

        } else {
          Sum = prefix[end] - prefix[Start - 1];

        }
        if (MaxSum < Sum) {
          MaxSum = Sum;

        }

      }

    }

    System.out.println("MAXIMUM SUM OF ARRAY IS" + MaxSum);

  }

  public static void main(String[] args) {

    int numbers[] = { 2, 4, 6, 8, 10 };
    MaxSubarrays(numbers);

  }
}