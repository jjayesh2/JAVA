
public class A5_Binary_Search {

    public static int binarySearch(int numbers[], int key) {

        int Start = 0;
        int End = numbers.length - 1;

        while (Start <= End) {
            int Mid = (Start + End) / 2;

            if (numbers[Mid] == key) { // FOUND
                return Mid;
            }

            if (numbers[Mid] < key) { // RIGHT
                Start = Mid + 1;

            } else {// LEFT
                End = Mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 16, 17, 18, 22, 58, 64 };
        int key = 58;

        System.out.println("THE KEY IS FOUNDED AT INDEX " + binarySearch(numbers, key));

    }

}
