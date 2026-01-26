class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // count characters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // check ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;   // ❗ important
            }
            count[c - 'a']--;   // decrease count
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.print(canConstruct(ransomNote, magazine));
    }
}
