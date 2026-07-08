public class hollow_rectangle {

    public static void hollow(int total_rows, int total_cols) {

        // for inner loop
        for (int i = 1; i <= total_rows; i++) {
            // for outer loop
            for (int j = 1; j <= total_cols; j++) {
                if (i == 1 || i == total_rows || j == 1 || j == total_cols) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        hollow(4, 4);

    }

}
