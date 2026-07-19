//!OPTOMIZED SOLUTION
//!2 POINTER APPROACH 
//Container = width - height
// Width = height[j] - height[i]
// minheight = min(height[i] , height[j])
//! in this there are 2 pointers 
//! SO WE HAVE TO DECIDE , THAT WE HAVE TO FORWARD THE LEFT POINTER (i++) OR REVERSE THE RIGHT POINTER [i--]


public class A10_Container_with_Most_Water {
    public static int Container(int height[]){

        int MaxWater = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            int width = right-left;
            int MinHeight = Math.min(height[left] ,height[right]);
            int Current_level = width * MinHeight;
            MaxWater = Math.max(MaxWater, Current_level);

           if (left < right) {
            left++;


            
           }
           else{
            right++;
           }
            
        }
        return MaxWater;
        
            
        
    }
    public static void main(String[] args) {
        int height [] = {1,8,6,2,5,4,8,3,7};
        System.out.println("MAX WATER WILL BE "+  Container(height));
        
    }
    
}
