public class binarytoDecimal {


    public static void binary(int binNum){

        int pow = 0;
        int dec = 0 ;

        while (binNum >0) {
            int lastDight = binNum % 10;
            dec = dec + (lastDight * (int) Math.pow(2 , pow));


            pow ++;
            binNum = binNum / 10;
            
            
        }
        System.out.println("decimal of " + binNum + " = " + dec);
    }
    public static void main(String[] args) {
        binary(101);
        
    }
    
}
