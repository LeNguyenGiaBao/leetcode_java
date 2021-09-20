public class _9_palindrome_number {
    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }

        int reverse = 0;
        int x_old = x;
        while(x!=0) {
            reverse = reverse*10 + (x%10);
            x = x/10;
        }
        System.out.println(reverse);
        return (x_old==reverse);
    }

    public static void main(String[] args) {
        boolean value = isPalindrome(-121);
        System.out.println(value);
    }
}
