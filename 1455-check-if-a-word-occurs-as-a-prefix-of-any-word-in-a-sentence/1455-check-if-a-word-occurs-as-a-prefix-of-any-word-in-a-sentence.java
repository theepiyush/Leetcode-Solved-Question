class Solution {

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // 1-based index
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";

        System.out.println(isPrefixOfWord(sentence, searchWord));
    }
}
