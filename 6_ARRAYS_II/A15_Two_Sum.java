//! THIS IS BETTER APPROACH
//! TIME COMPLEXIY === O(nlogn)

public class A15_Two_Sum {

    public static int twoSum(int array[], int target) {

        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int sum = array[start] + array[end];

            if (sum == target) {
                System.out.println("indices " + start + "  and " + end);
                return 1;

            }
            if (sum < target) {
                start++;

            } else {
                end--;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 5, 7, 8, 11, 15, 17 };
        int target = 12;
        twoSum(array, target);

    }

}
