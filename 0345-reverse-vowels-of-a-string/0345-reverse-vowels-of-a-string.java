class Solution {
    public static String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = n - 1;

        while (start < end) {
            //  if it's not a vowel
            if (!isVowel(ch[start])) {
                start++;
            }
            // if it's not a vowel
            else if (!isVowel(ch[end])) {
                end--;
            }
            //  swap
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm")); 

    }
}
