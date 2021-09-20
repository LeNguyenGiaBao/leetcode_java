public class sort_insertion_sort {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i-1;
            while(j>=0 && a[j]>ai) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = ai;
            printArray(a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
        insertionSort(a);
    }
}