//THIS APPROACH IS OPTIMIZED AND FASTER THEN BRUTE FORCE 
//IT FIRST SORT THE ARRAY AND THEN CHECK FREQUENCY ONE BY ONE ,, IF FREQ IS MORE THEN (n/2) THEN IT IS MAJORITY ELEMENT 
//! time complexity == O(nlogn)

import java.util.Arrays;

public class A12_Majority_Element {
    public static int majority(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;

        int frequency = 1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                frequency++;
                
            }
            else{
                frequency = 1;
                ans = nums[i];
            }


            if (frequency > n/2) {
                return ans;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,1,2,1,2,2,1};
        System.out.println(majority(nums));
    }
}
