import java.util.ArrayList;
import java.util.List;

public class _386_lexicographical_numbers {

    public static List<Integer> result = new ArrayList<>();
    public static int MAX = 0;

    public static void dfs(int base) {
        if (base <= MAX) {
            for (int i = 0; i < 10; i++) {
                int newBase = base * 10 + i;
                if (newBase != 0 && newBase <= MAX) {
                    result.add(newBase);
                    dfs(newBase);
                }
            }
        }
    }

    public static List<Integer> lexicalOrder(int n) {
        MAX = n;

        dfs(0);
        return result;
    }

    public static void main(String[] args) {
        int n = 13;
        List<Integer> result = lexicalOrder(n);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }
}
