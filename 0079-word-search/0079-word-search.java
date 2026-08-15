class Solution {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (findInOtherDir(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    boolean findInOtherDir(char[][] arr, int m, int n,
                           String word, int index) {

        // Successfully matched entire word
        if (index == word.length()) {
            return true;
        }

        // Out of bounds
        if (m < 0 || m >= arr.length ||
            n < 0 || n >= arr[0].length) {
            return false;
        }

        // Current character doesn't match
        if (arr[m][n] != word.charAt(index)) {
            return false;
        }

        // Mark current cell as visited
        char temp = arr[m][n];
        arr[m][n] = '#';

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {

            int nr = m + dr[k];
            int nc = n + dc[k];

            if (findInOtherDir(arr, nr, nc, word, index + 1)) {
                return true;
            }
        }

        // Backtrack
        arr[m][n] = temp;

        return false;
    }
}