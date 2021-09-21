public class _1816_truncate_setence {
    public static String truncateSentence(String s, int k) {
        StringBuilder reuslt = new StringBuilder();

        char[] arr = s.toCharArray();   // convert s to char array
        int countSpace = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 32) {
                countSpace++;
                if (countSpace == k ) {
                    return reuslt.toString();
                }
            }
            reuslt.append(arr[i]);
        }
        return reuslt.toString();
    }

    public static String truncateSentence_usingSplit(String s, int k) {
        String[] arr = s.split(" ");
        String result = "";
        for (int i = 0; i < k-1; i++) {
            result = result + arr[i] + " ";
        }
        result += arr[k-1];
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }
}
