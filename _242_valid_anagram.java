public class _242_valid_anagram {
    public static boolean isAnagram(String s, String t) {
        //Hash Map: FAILED

        // int n1 = s.length();
        // int n2 = t.length();
        
        // if (n1 != n2) {
        //     return false;
        // }
        // Map<Character, Integer> map1 = new HashMap<>();
        // Map<Character, Integer> map2 = new HashMap<>();
        // for (int i = 0; i < n1; i++) {
        //     char ai = s.charAt(i);
        //     if (map1.containsKey(ai) == false) {
        //         map1.put(ai, 1);
        //     } else {
        //         int count = map1.get(ai);
        //         count ++;
        //         map1.put(ai, count);
        //     }

        //     char bi = t.charAt(i);
        //     if (map2.containsKey(bi) == false) {
        //         map2.put(bi, 1);
        //     } else {
        //         int count2 = map2.get(bi);
        //         count2 ++;
        //         map2.put(bi, count2);
        //     }
        // }
        // if (map1.size() != map2.size()) {
        //     return false;
        // }

        // for (int i = 0; i < map1.size(); i++) {
        //     Object key1 = map1.keySet().toArray()[i];
        //     Object value1 = map1.get(key1);
        //     Object value2 = map2.get(key1);
        //     if (value1 != value2) {
        //         return false;
        //     }
        // }

        // return true;

        int n1 = s.length();
        int n2 = t.length();
        
        if (n1 != n2) {
            return false;
        }

        int[] char_counts = new int[26];
        for (int i = 0; i < n1; i++) {
            char_counts[s.charAt(i) - 'a'] ++;
            char_counts[t.charAt(i) - 'a'] --;
        }
        
        for (int i = 0; i < char_counts.length; i++) {
            if (char_counts[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "dgqztusjuu";
        String t = "dqugjzutsu";

        System.out.println(isAnagram(s, t));
    }
}
