public class A6_Problem2 {
    public static void SelectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;

                }

            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }
    }

    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        SelectionSort(array);
        print(array);
    }

}
