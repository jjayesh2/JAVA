public class prime {

    // ! checks if a number is prime or not

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;

            }

        }
        return isPrime;

    }

    // !prints number which are prime
    public static void inRange(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (isPrime(i)) {
                System.out.println(i);

            }

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // System.out.println(isPrime(12));
        inRange(20);
    }

}