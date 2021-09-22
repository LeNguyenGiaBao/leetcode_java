public class _704_binary_search {
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    public static int binary_search(int[] a, int key) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n-1;

        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight)/2;

            if (a[iMid] == key) {
                return iMid;
            } else if (a[iMid] < key) {
                iLeft = iMid + 1;
            } else {
                iRight = iMid -1;
            }
        }
        
        return -1; // not found
    }

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    public static int binary_search_recursion(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMid = (iLeft + iRight)/2;
        if (a[iMid] == key) {
            return iMid;
        } else if (a[iMid] < key) {
            return binary_search_recursion(a, key, iMid+1, iRight);
        } else {
            return binary_search_recursion(a, key, iLeft, iMid-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {-1,0,3,5,9,12};
        System.out.println(binary_search(a, 9));
        System.out.println(binary_search_recursion(a, 9, 0, a.length-1));
    }
}
