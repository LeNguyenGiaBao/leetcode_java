public class _7_reverse_number {
    public static int reverse(int x) {
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE) {
            return 0;
        }
        int y=0;
        while (x !=0) {
            if(y>Integer.MAX_VALUE/10 || y<Integer.MIN_VALUE/10) {
                return 0;
            }
            y = y*10 + (x%10);
            x = x /10;
        }
        return y;
    }

    public static void main(String[] args) {
        int value = reverse(1534236469);
        System.out.println(value);
    }
}
