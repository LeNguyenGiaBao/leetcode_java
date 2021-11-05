public class _441_arranging_coins {
    public static int arrangeCoins(int n) {
        int result = 0;
        int count = 0;

        while (n >= 0) {
            count++;
            n = n - count;
            result++;
        }
        return result - 1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}
