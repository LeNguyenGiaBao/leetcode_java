public class _1295_find_numbers_with_even_number_of_digits {
    public static int findNumbers(int[] nums) {
        int count = 0;

        // 2ms, faster 22% people
        // for (int i : nums) {
        //     int the_number_of_a_numer = findTheNumberOfANumber(i);
        //     if (the_number_of_a_numer % 2 == 0) {
        //         count ++;
        //     }
        // }


        // shorter but longer
        // for (int i : nums) {
        //     if(Integer.toString(i).length() %2 ==0)
        //         count++;
        // }

        return count;
    }

    public static int findTheNumberOfANumber(int number) {
        int quotient = 1;
        int count = 0;
        while(quotient!=0) {
            quotient = number / 10;
            number = quotient;
            count ++;
        }
        return count;
    }


    public static void main(String[] args) {
        // int[] nums = {1,2,3,4};
        // for (int i : nums) {
        //     System.out.println(i);
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        // int[] n2 = new int[4];
        // for (int i = 0; i < n2.length; i++) {
        //     n2[i] = n2.length - i;
        // }

        // for (int i : n2) {
        //     System.out.println(i);
        // }

        // int value = findTheNumberOfANumber(1234);   // =4
        int[] nums = {12,345,2,6,7896};
        int value = findNumbers(nums);
        System.out.println(value);
    }
}
