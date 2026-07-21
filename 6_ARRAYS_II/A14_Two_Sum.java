//! BRUTE FORCE APPROACH
//! TIME COMPLEXITY = O(n^2)


public class A14_Two_Sum {

    public static int twoSum(int array[] , int target){

        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i+1; j < array.length; j++) {
                int second = array[j];


                if (first + second == target) {
                    System.out.println("indices " + i + " and  " + j);
                    return 1;
                    
                    
                    
                }
                
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {2,5,7,11,15};
        int target = 9;

    twoSum(array, target);
    
    }
    
}
