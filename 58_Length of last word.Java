Problem: Given a string containing words and spaces, return the length of the last word, ignoring any trailing spaces.
Solution: Start from the end of the string, skip trailing spaces, then count characters until you reach a space or the beginning of the string.


class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') i--;   // skip trailing spaces
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
