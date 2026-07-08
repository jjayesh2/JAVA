//! REVERSE OF A NUMBER...


public class A7_Reverse_Number {


    public static void reverse(int number[] ){


        int first =0;
        int last = number.length-1;

        while (first<last) {
            int temp = number[last];
            number[last] = number [first];
            number[first] = temp;

            first ++;
            last --;
            
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2 , 4 , 6 , 8 , 10};
        
        for (int i = 0; i < numbers.length; i++) {

             reverse(numbers);
            System.out.println(numbers[i]);           
        }
        
    }
    
}
