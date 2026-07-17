//! becauseo of Collections.reverseOrder() works with object not with primitive type we use Integer() , not int()...


import java.util.Arrays;
import java.util.Collections;

public class A3_Insertion_Sort {

    public static void Insertion(Integer array[]){

        for (int i = 1; i < array.length; i++) {
            int curr = i;
            int prev = i-1;
            while (prev >= 0 && array[prev] > curr ) {
                array[prev+1] = array[prev];
                prev--;
                
            }
            array[prev+1] = curr;
            
        }

    }
        public static void Printt(Integer array[]){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            System.out.println();




    }
    public static void main(String[] args) {

        Integer array[] = { 5,4,3,2,1};
        

        Arrays.sort(array, Collections.reverseOrder());
        Printt(array);


        
    }
    
}
