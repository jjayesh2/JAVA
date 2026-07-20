public class A13_Majority_Element {

    public static int majority(int nums[]) {
        int ans = 0;
        int frequency = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (frequency == 0) {
                ans = nums[i];

            }
            if (ans == nums[i]) {
                frequency++;

            } else {
                frequency--;
            }
        }

        int count = 0;
        for (int val : nums) {
            if (val == ans) {
                count++;

            }
            if (count > n / 2) {
                return ans;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(majority(nums));
    }

}
