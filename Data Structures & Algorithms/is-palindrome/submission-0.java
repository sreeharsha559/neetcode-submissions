class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        // Remove non-alphanumeric characters
        // and convert to lowercase
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str += Character.toLowerCase(ch);
            }
        }

        // Reverse the string
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Compare
        return str.equals(reverse);
    }
}