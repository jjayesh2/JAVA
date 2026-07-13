class A8_Search_in_Rotated_Sorted_Array {
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return true ;

            }
                if(nums[mid] == nums[left] && nums[right] == nums[mid]){
                    right --;
                    left ++;
                    continue;
                }

            if(nums[mid] >= nums[left]){
                if(target >=nums[left] && target < nums[mid]){
                    right = mid -1;

                
            }
            else{
                left = mid +1;
            }

            }
            else{
                if(target <= nums[right] &&  target > nums[mid]){
                    left =mid +1;
                }
                else{
                    right = mid - 1;
                }
            }
            
        }
        return false;

        
    }
    public static void main(String [] args){
        int nums[] = {2,5,6,0,0,1,2};
        // Solution obj = new Solution();
        System.out.println(search(nums,  0));

    }
}