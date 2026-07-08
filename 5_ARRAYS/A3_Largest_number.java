//! FIND LARGEST NUMBER USING LINEAR SEARCH:-


public class A3_Largest_number {

    public static int Largest(int numbers[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = { 4, 5, 8, 9, 10, 12, 6, 2 };

        System.out.println("LARGEST NUMBER IS " + Largest(numbers));

    }

}
