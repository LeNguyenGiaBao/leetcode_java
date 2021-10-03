public class _67_add_binary {
    public static String addBinary(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        if (n1 < n2) {
            a = fill(a, n2);
        } else {
            b = fill(b, n1);
        }

        int n = a.length() - 1;
        int flag = 0;
        String result = "";
        for (int i = n; i >= 0; i--) {
            int ai = Integer.parseInt(String.valueOf(a.charAt(i)));
            int bi = Integer.parseInt(String.valueOf(b.charAt(i)));
            int sum = ai + bi + flag;
            if (sum <2) {
                flag = 0;
            }
            else if (sum == 2) {
                sum = 0;
                flag = 1;
            } else if (sum == 3) {
                sum =1;
                flag =1;
            }
            result = String.valueOf(sum) + result;
        }
        if (flag != 0) {
            result = String.valueOf(flag) + result;
        }
        
        return result;
    }

    public static String fill(String a, int n) {
        int na = a.length();
        String result = "";
        for (int i = 0; i < n-na; i++) {
            result = result + "0";
        }
        result = result + a;

        return result;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String result = addBinary(a, b);
        System.out.println(result);
    }
}
