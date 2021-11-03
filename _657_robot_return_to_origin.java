public class _657_robot_return_to_origin {
    public static boolean judgeCircle(String moves) {
        int left = 0;
        int up = 0;

        char[] a = moves.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'L') {
                left++;
            } else if (a[i] == 'R') {
                left--;
            } else if (a[i] == 'U') {
                up++;
            } else {
                up--;
            }
        }

        if (left == 0 && up ==0) {
            return true;
        } 
        
        return false;
    }

    public static void main(String[] args) {
        String moves = "LDRRLRUULR";
        System.out.println(judgeCircle(moves));
    }
}