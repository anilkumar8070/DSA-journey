class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int n = words.length;

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {

            String str = words[i];

            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            boolean isVowel =
                (first == 'a' || first == 'e' || first == 'i' ||
                 first == 'o' || first == 'u') &&
                (last == 'a' || last == 'e' || last == 'i' ||
                 last == 'o' || last == 'u');

            prefix[i + 1] = prefix[i] + (isVowel ? 1 : 0);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = prefix[r + 1] - prefix[l];
        }

        return ans;
    }
}