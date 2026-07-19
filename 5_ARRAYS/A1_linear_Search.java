public class A1_linear_Search {

    public static int linear(int number[], int key) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 12;

        int index = linear(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");

        }

        else {
            System.out.println("KEY FOUNDED AT INDEX " + index);
        }

    }

}