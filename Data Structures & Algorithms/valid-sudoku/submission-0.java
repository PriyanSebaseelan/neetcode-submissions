class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> check = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num == '.') {
                    continue;
                }

                if (check.contains(num)) {
                    return false;
                } else {
                    check.add(num);
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Character> check = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char num = board[j][i];

                if (num == '.') {
                    continue;
                }

                if (check.contains(num)) {
                    return false;
                } else {
                    check.add(num);
                }
            }
        }

        for (int i = 0; i < 7; i += 3) {
            for (int j = 0; j < 7; j += 3) {
                HashSet<Character> check = new HashSet<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        char num = board[l][k];

                        if (num == '.') {
                            continue;
                        }

                        if (check.contains(num)) {
                            return false;
                        } else {
                            check.add(num);
                        }
                    }
                }
            }
        }

        return true;
    }
}
