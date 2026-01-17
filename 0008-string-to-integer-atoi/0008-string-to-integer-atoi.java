class Solution {
    static int myAtoi(String s) {
        // Remove white spaces
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        long num = 0;
        int n = s.length();

        // Handle optional sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // Check overflow
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign * num);
    }

    public static void main(String[] args) {
        String s = " -042";
        System.out.println(myAtoi(s));  // Output: -42
    }
}
