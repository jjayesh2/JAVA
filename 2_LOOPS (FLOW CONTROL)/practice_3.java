import java.util.Scanner;

public class practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number ;
        int factorial = 1;


        System.out.println("ENTER NUMBER TO GET FACTORIAL");
         number = sc.nextInt();


         if (number <=0) {
            System.out.println("NUMBER IS LESS THAN 0 !!! ERROR");
            
         }

         else{
            for (int i = 1; i <=number; i++) {
                factorial = factorial * i;


                
            }
            System.out.println("FACTORIAL OF " + number + ":" + factorial);
         }



    }


    
}
