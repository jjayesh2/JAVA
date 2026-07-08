public class factorial {

    public static int factorial(int n){

        int f = 1;
        for (int i = 1; i <=n; i++) {
            f = f * i;


        }
        return f;
        //System.out.println("THE FACATORIAL OF " + n + " IS " + f);
    }
    public static void main(String[] args) {
        
       System.out.println("THE FACATORIAL  IS " + factorial(4)); 
    }
    
}
