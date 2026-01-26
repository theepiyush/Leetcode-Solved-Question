import java.util.HashMap;

class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> hm = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            // agar word already kisi aur character se mapped hai
            if (hm.containsValue(arr[i]) && !hm.containsKey(ch)) {
                return false;
            }

            // agar character already hai but word match nahi karta
            if (hm.containsKey(ch) && !hm.get(ch).equals(arr[i])) {
                return false;
            }

            hm.put(ch, arr[i]);
        }

        return true; // ✅ loop ke bahar
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
