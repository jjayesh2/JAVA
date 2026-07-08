public class reverse {
    public static void main(String[] args) {
        int number = 10899;
        int lastDigit = 0; 

        for (int i = 0; i <=number; i++) {
            lastDigit = number%10;
            System.out.println(lastDigit);
            number = number/10;
            
            
        }
    }
    
}
