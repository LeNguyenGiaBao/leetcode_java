public class recursion_fibonaci {
    public static int fibo(int n) {
        // fibo(1) = 1 and fibo(2) = 1
        if(n<=2) {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}
