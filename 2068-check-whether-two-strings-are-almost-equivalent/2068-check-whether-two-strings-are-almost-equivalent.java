class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq = new int[26];

        // Count frequency for word1
        for (int i = 0; i < word1.length(); i++) {
            freq[word1.charAt(i) - 'a']++;
        }

        // Subtract frequency for word2
        for (int i = 0; i < word2.length(); i++) {
            freq[word2.charAt(i) - 'a']--;
        }

        // Check difference
        for (int i = 0; i < 26; i++) {
            if (Math.abs(freq[i]) > 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "aaa";
        String word2 = "bccd";
        Solution solution = new Solution();
        System.out.println(solution.checkAlmostEquivalent(word1, word2));
    }
}
