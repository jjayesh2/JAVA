import java.util.Scanner;

public class A1_Creation {

    public static void largeElement(int matrix[][]) {
        int maxLarge = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxLarge) {
                    maxLarge = matrix[i][j];

                }

            }
        }
        System.out.println("LARGEST ELEMENT IS " + maxLarge);
    }

    public static int smallerElement(int matrix[][]) {
        int smaller = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < smaller) {
                    smaller = matrix[i][j];

                }

            }

        }
        System.out.println("SMALLEST ELEMENT IS " + smaller);
        return smaller;
    }

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {

                    System.out.print("element fount at  ( " + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                matrix[i][j] = sc.nextInt();

            }
        }
        // OUTPUT
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        search(matrix, 5);
        largeElement(matrix);
        smallerElement(matrix);

    }

}
