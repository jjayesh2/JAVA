//THIS APPROACH IS OPTIMIZED AND FASTER THEN BRUTE FORCE 
//IT FIRST SORT THE ARRAY AND THEN CHECK FREQUENCY ONE BY ONE ,, IF FREQ IS MORE THEN (n/2) THEN IT IS MAJORITY ELEMENT 
//! time complexity == O(nlogn)
public class A12_Majority_Element {
    public static int majority(int nums[]){
        int n = nums.length;

        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int frequency = 1;
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
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
}
