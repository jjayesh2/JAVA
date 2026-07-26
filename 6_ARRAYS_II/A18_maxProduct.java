//! this is optimal approach
//! TIME COMPLEXITY O(n log n)


public class A18_maxProduct {

    public static int maxProduct(int [] nums){
        int n = nums.length;
        int productA = nums[n-1] * nums[n-2] * nums[n-3];
        int productB = nums[0] * nums[1] * nums[n-1];

        int maxProduct = Math.max(productA, productB);
        return maxProduct;
    }


    public static void main(String[] args) {

         int nums[] = {-10,-9,1,2,3,4};
        System.out.println(maxProduct(nums));
        
        
    }
    
}
