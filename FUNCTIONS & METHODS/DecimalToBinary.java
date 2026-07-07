public class DecimalToBinary {

    public static void decimal(int n ){


        int power = 0 ;
        int binNum = 0;

        while (n>0) {
            int remainder = n % 2;
            binNum = binNum + (remainder * (int) Math.pow(10, power));
            

            power ++ ;
            n = n/2; 
        }
        System.out.println(binNum);


    }
    public static void main(String[] args) {
        decimal(7);
        
    }
    
}
