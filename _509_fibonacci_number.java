public class _509_fibonacci_number {
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int fibo = 0;
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fibo = a+b;
                a=b;
                b=fibo;
            }
            return fibo;
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
