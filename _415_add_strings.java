public class _415_add_strings {
    public static String addStrings(String num1, String num2) {
        char[] a1 = num1.toCharArray();
        char[] a2 = num2.toCharArray();
        int n1 = a1.length;
        int n2 = a2.length;
        int i = 0;
        int debt = 0;
        String result = "";

        while (i < n1 && i < n2) {
            int sum = a1[n1-1-i] + a2[n2-1-i] + debt - 2 * 48;
            if (sum > 9) {
                sum -= 10;
                debt = 1;
            } else {
                debt = 0;
            }
            result = String.valueOf(sum) + result;
            i++;
        }

        while (i < n1) {
            int sum = a1[n1-1-i] + debt - 48;
            if (sum > 9) {
                sum -= 10;
                debt = 1;
            } else {
                debt = 0;
            }
            result = String.valueOf(sum) + result;
            i++;
        }

        while (i < n2) {
            int sum = a2[n2-1-i] + debt - 48;
            if (sum > 9) {
                sum -= 10;
                debt = 1;
            } else {
                debt = 0;
            }
            result = String.valueOf(sum) + result;
            i++;
        }
        
        if (debt == 1) {
            result = "1" + result;
        }

        return result;
    }

    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "9";

        String result = addStrings(num1, num2);
        System.out.println(result);
    }
}