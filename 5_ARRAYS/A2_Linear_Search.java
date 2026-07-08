// !PRACTICE QUESTION

public class A2_Linear_Search {

    public static int linear(String fruits[], String key) {

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String fruits[] = { "MANGO", "PINEAPPLE", "BANANA", "ORANGE", "APPLE", "CHIKU", "GUAVA" };
        String key = "ORANGE";

        int index = linear(fruits, key);

        if (index == -1) {
            System.out.println("FRUIT NOT FOUND IN THE ARRAY");

        } else {
            System.out.println("FRUIT FOUNDED AT INDEX " + index);
        }

    }

}
