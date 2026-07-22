//!Container with Most Water Problem 

//! BUT WITH BRUTE FORCE NOT OPTIMAL 

public class A9_Container_with_Most_Water {

    public static int Container(int height[]) {
        int MaxWater = 0;
        for (int i = 0; i < height.length; i++) {


            

            for (int j = i + 1; j < height.length; j++) {




                int width = j - i;
                int MinHeight = Math.min(height[i], height[j]);
                int Current_level = width * MinHeight;
                MaxWater = Math.max(MaxWater, Current_level);

            }
        }
        return MaxWater;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(Container(height));

    }

}