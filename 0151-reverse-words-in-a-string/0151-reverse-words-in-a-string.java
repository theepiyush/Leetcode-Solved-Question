class Solution {
    public static String reverseWords(String s) {
        // Divide string into words, removing whitespaces
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is bule  "));
    }
}
