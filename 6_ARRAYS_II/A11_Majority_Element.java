//BRUTE FORCE 
//THE ELEMENT WHICH IS PRESENT IN ARRAY MORE THAT (n/2) TIMES IS MAJORITY ELEMENT....
//{1,2,1,1,2} = 5/2 = 2.5 = 2 ........1 IS PRESENT MORE THAN 2 TIMES 
public class A11_Majority_Element {
    public static int majority(int array[]){
        int n = array.length;

        for (int i : array) {
            int frequency = 0;
            for (int j : array) {
                if (j == i) {
                    frequency ++;

                    
                }
                
            }
            if (frequency > n/2) {
                return i;


                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = { 2, 2, 1, 1, 2, 2, 2};
        System.out.println( "MAJORITY ELEMENT IS  " + majority(array));
    }
    
    
}
