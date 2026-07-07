public class Butterfly {

    public static void butterfly(int n) {
         
        for (int i = 1; i <= n; i++) {

            // FOR STARS = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // FOR SPACES = 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // FOR STARS = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            // FOR STARS = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // FOR SPACES = 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // FOR STARS = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {

        butterfly(3);
    }

}
