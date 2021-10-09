import java.util.HashSet;

public class _202_happy_number {
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            int current = n;
            int sum = 0;

            while (current != 0) {
                int x = current % 10;
                sum = sum + x * x;
                current = current /10;
            }

            if (sum == 1) {
                return true;
            } else {
                seen.add(n);
                n = sum;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean result = isHappy(12);
        System.out.println(result);
    }
}
