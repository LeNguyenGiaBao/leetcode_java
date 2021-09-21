public class recursion_fibonaci {
    public static int fibo(int n) {
        System.out.println("Calculate F[" + n + "]");
        // fibo(1) = 1 and fibo(2) = 1
        if(n<=2) {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    // recursion with save variable
    static int[] F = new int[1000];
    public static int fibo2(int n) {
        if(F[n] !=0) {
            return F[n];
        }
        System.out.println("Calculate F[" + n + "]");
        if(n<=2) {
            F[1]=1;
            F[2]=1;
            return 1;
        }

        F[n] = fibo2(n-1) + fibo2(n-2);
        return F[n];
    }

    public static void main(String[] args) {
        // System.out.println(fibo(10));
        System.out.println(fibo2(10));
    }
}
