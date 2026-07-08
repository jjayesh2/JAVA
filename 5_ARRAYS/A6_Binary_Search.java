import java.util.Scanner;

public class A6_Binary_Search {

    public static int binary(int numbers[], int key) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;

            }
            if (numbers[mid] > key) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF ELEMENTS");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("ENTER " + n + "NUMBERs TO FIND");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

        }

        System.out.println("ENTER WHICH NUMBER YOU HAVE TO FOUND");
        int key = sc.nextInt();

        int index = binary(numbers, key);

        System.out.println("THE INDEX OF THE NUMBER IS " + index);
    }

}
