//!FIND THE SMALLEST NUMBER IN THE ARRAY...
//!TIME COMPLEXITY = O(n) 
//!BECAUSE WE RUN A FOR LOOP TILL N NUMBER OF TIMES 


public class A4_Smallest_Number {

    public static int Smallest(int numbers[]) {

        int smaller = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smaller > numbers[i]) {
                smaller = numbers[i];

            }
        }
        return smaller;
    }

    public static void main(String[] args) {

        int numbers[] = { 4, 5, 8, 9, 10, 12, 6, 2 };

        System.out.println("THE SMALLEST NUMBER IN THE ARRAY IS " + Smallest(numbers));

    }

}
