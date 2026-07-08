public class binomial_cofficient {

    public static int factorial(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n - r);

        int binCoeff = n_fact / (r_fact * n_r_fact);

        return binCoeff;

    }

    public static void main(String[] args) {

        System.out.println(binCoeff(5, 2));

    }
}
