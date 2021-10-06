public class _482_license_key_formatting {
    public static String licenseKeyFormatting(String s, int k) {
        String result = "";
        char[] ch = s.toCharArray();
        int n = ch.length;
        int count = 0;
        for (int i = n-1; i >= 0; i--) {
            if(ch[i] != '-') {
                count++;
                if (count > k) {
                    result = "-" + result;
                    count = 1;
                }

                result = Character.toUpperCase(ch[i]) + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "----a--a----a---a---aaaa--";
        int k = 2;
        String result = licenseKeyFormatting(s, k);
        System.out.println(result);
    }
}