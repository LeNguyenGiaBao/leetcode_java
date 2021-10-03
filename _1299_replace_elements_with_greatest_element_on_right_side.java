public class _1299_replace_elements_with_greatest_element_on_right_side {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        result[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            result[i] = Math.max(result[i+1], arr[i+1]);
        }
        result[n-1] = -1;

        return result;
    }

    public static void main(String[] args) {
        int[] a = {17,18,5,4,6,1};
        int[] result = replaceElements(a);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
