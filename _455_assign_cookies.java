import java.util.Arrays;

public class _455_assign_cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ig = g.length - 1;
        int is = s.length - 1;
        int count = 0;

        while (ig >= 0 && is >= 0) {
            if (s[is] >= g[ig]) {
                count++;
                ig--;
                is--;
            } else {
                ig--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }
}
