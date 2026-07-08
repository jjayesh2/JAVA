import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 1000 == 0) {
            System.out.println("THIS IS LEAP YEAR");

        } else {
            System.out.println("THIS IS NOT A LEAP YEAR");
        }
    }

}
