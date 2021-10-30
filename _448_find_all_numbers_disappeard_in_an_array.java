import java.util.ArrayList;
import java.util.List;

public class _448_find_all_numbers_disappeard_in_an_array {
    public static List<Integer> findDisappearedNumbers(int[] a) {
        List<Integer> result = new ArrayList<>();
        int n = a.length;
        boolean[] exist = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            exist[a[i]] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            if (exist[i] == false) {
                result.add(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(a);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}