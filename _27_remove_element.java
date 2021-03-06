public class _27_remove_element {

    public static int removeElement(int[] a, int val) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            if (a[i] == val) {
                for (int j = i; j < n-1; j++) {
                    a[j] = a[j+1];
                }
                n--;
                i--;
            }
        }
        return n;
    }

    public static int removeElement_2pointers(int[] a, int val) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!= val) {
                a[k]=a[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(removeElement(a, 3));
        // System.out.println(removeElement_2pointers(a, 3));
        System.out.println("DONE");
    }
}