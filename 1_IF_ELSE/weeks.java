import java.util.Scanner;
public class weeks {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER WEEK NUMBER");
        int week = sc.nextInt();
        switch (week) {
            case 1:System.out.println("TODAY IS MONDAY");
                
              break;

             case 2:System.out.println("TODAY IS TUESDAY");
                
                break;

             case 3:System.out.println("TODAY IS WEDNESDAY");
                
                break;

             case 4:System.out.println("TODAY IS THRUSDAY");
                
                break;

             case 5:System.out.println("TODAY IS FRIDAY");
                
                break;

             case 6:System.out.println("TODAY IS SATURDAY");
                
                break;

             case 7:System.out.println("TODAY IS SUNDAY");
                
                break;
        
            default:System.out.println("JUST CHILL");
                break;
        }
      
            
            
        }

    }

