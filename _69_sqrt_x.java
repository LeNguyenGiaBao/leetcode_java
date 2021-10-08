public class _69_sqrt_x {
    public static int mySqrt(int x) {
        long l = 1;
        long r = x;
        while (l +1  < r) {
            long mid = l + (r - l) /2;
            // System.out.println(mid);
            if (mid * mid == x) {
                return (int)mid;
            } else if ( mid * mid < x) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if (r * r == x) {
            return (int)r;
        }
        return (int)l;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
