//! THIS IS BRUETE FORCE APPROACH ..
//! TIME COMPLEXITY :- O(n³)


public class A17_maxProduct{

    public static int maxProduct(int [] nums){
        int Maximum = Integer.MIN_VALUE;
        int product =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int j2 = j+1; j2 < nums.length; j2++) {
                    product = nums[i] * nums[j] * nums[j2];
                    Maximum = Math.max(Maximum, product);

                    
                }
                
            }
            
        }
        return Maximum;



    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(maxProduct(nums));
        
    }
    
}