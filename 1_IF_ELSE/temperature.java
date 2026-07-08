import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER BODY TEMPERATURE");
        double temperature= sc.nextDouble();

        if (temperature <100){
            System.out.println("YOU DONT HAVE FEVER");

        }
        else{
            System.out.println("YOU HAVE FEVER");
        }
    }
    
}
