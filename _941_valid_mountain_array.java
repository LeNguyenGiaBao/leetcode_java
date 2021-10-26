public class _941_valid_mountain_array {
    public static boolean validMountainArray(int[] a) {
        boolean isIncrease = true;
        boolean isChanged = false;
        int n = a.length;

        if (n < 3) {
            return false;
        }

        if (a[0] > a[1]) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i+1] != isIncrease) {
                if ( isChanged == false) {
                    isChanged = true;
                    isIncrease = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {3,5,5};
        System.out.println(validMountainArray(a));
    }
}
