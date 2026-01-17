class Solution {
    public static int lengthOfLastWord(String s) {
        String str = s.trim();  
        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {  // check if character is not a space
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
      //  String s = "Hello World";
      //  System.out.println(lengthOfLastWord(s));
           String s = "fly me to the moon";
        System.out.println(lengthOfLastWord(s));
    }
}
