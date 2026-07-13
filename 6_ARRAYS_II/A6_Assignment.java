public class A6_Assignment {
    public static boolean Array(int nums[]){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i==j) {
                    return true;
                    
                }
                
            }
            
        }
        return false;
        
    }

  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 1};
    System.out.println(Array(nums));

    
  }

}
