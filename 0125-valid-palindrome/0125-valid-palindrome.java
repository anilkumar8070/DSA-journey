class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                str += Character.toLowerCase(ch);
            }
        }

        String rev = new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }
}