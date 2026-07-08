
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER");
        int a = sc.nextInt();
        System.out.println("ENTER 2ND NUMBER");
        int b = sc.nextInt();
        System.out.println("ENTER OPERATOR");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '1':
                System.out.println(a + b);

                break;

            case '2':
                System.out.println(a - b);

                break;

            case '3':
                System.out.println(a / b);

                break;

            case '4':
                System.out.println(a * b);

                break;

            default:
                System.out.println("error");
                break;
        }
    }

}
