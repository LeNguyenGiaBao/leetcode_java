public class _50_pow_x_n {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        int n_2 = 0;
        if (n < 0) {
            n_2 = n % 2 == 0 ? -(n/2) : (-n -1) / 2;
            x = 1/x;
        } else {
            n_2 = n % 2 == 0 ? n/2 : (n - 1) / 2;
        }

        if (n % 2 == 0) {
            double t = myPow(x, n_2);
            return t * t;
        } else {
            double t = myPow(x, n_2);
            return x * t * t;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
