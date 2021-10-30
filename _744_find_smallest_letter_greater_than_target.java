public class _744_find_smallest_letter_greater_than_target {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';

        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }
}
