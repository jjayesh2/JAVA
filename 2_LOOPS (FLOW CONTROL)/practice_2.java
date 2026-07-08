import java.util.*;
public class practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n , num;
        int oddnum=0;
        int evennum=0;


        System.out.println("enter how many numbers to add");
        n=sc.nextInt();

        for (int i = 0; i <=n; i++) {
            System.out.println("ENTER NUMBERS " + i + ":");
            num = sc.nextInt();



            if (num%2==0) {
                evennum = evennum+num;

            
        }
        else{
            oddnum = oddnum+num;
        }
        
    }
    System.out.println("ADDITION OF EVEN NUMBERS ARE " + evennum);
    System.out.println("ADDITION OF ODD NUMBERS ARE " + oddnum);
    }

}
