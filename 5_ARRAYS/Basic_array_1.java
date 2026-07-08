
//!BASICS OF ARRAY ALSO IN NOTEBOOK

import java.util.Scanner;

public class Basic_array_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];

        System.out.println("ENTER YOUR MARKS OF OOPs");
        marks[0] = sc.nextInt();

        System.out.println("ENTER YOUR MARKS OF DBMS");
        marks[1] = sc.nextInt();
        System.out.println("ENTER YOUR MARKS OF AIML");
        marks[2] = sc.nextInt();
        System.out.println("ENTER YOUR MARKS OF COMP");
        marks[3] = sc.nextInt();
        System.out.println("ENTER YOUR MARKS OF IOT");
        marks[4] = sc.nextInt();

        System.out.println("MARKS OF DBMS" + marks[1]);

        System.out.println("LENGTH OF THE ARRAY IS " + marks.length);

    }

}