public class _717_1_bit_and_2_bit_characters {
    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if (n == 1) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (i + 1 == n) {
                return true;
            }
            if (bits[i] == 1) {
                if (i + 1 == n) {
                    return true;
                }
                i++;
            } 

        }

        return false;
    }

    public static void main(String[] args) {
        int[] bits = {1,1,1,0};
        boolean result = isOneBitCharacter(bits);
        System.out.println(result);
    }
}
