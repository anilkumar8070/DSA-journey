import java.util.ArrayList;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        ArrayList<String> list = new ArrayList<>();
        int len1 = word1.length();
        int len2 = word2.length();
        int n = Math.max(len1, len2);

        for (int i = 0; i < n; i++) {
            if (i < len1) {
                list.add(String.valueOf(word1.charAt(i)));
            }
            if (i < len2) {
                list.add(String.valueOf(word2.charAt(i)));
            }
        }

       
        StringBuilder sb = new StringBuilder();
        for (String ch : list) {
            sb.append(ch);
        }

        return sb.toString();
    }
}