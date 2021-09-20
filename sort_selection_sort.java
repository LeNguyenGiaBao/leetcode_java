public class sort_selection_sort {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            printArray(a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
        selectionSort(a);
    }
}
