package Recursion;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                { '9', '5', '7', '.', '1', '3', '.', '8', '4' },
                { '4', '8', '3', '.', '5', '7', '1', '.', '6' },
                { '.', '1', '2', '.', '4', '9', '5', '3', '7' },
                { '1', '7', '.', '3', '.', '4', '9', '.', '2' },
                { '5', '.', '4', '9', '7', '.', '3', '6', '.' },
                { '3', '.', '9', '5', '.', '8', '7', '.', '1' },
                { '8', '4', '5', '7', '9', '.', '6', '1', '3' },
                { '.', '9', '1', '.', '3', '6', '.', '7', '5' },
                { '7', '.', '6', '1', '8', '5', '4', '.', '9' }
        };
        solve(board);
        for (char[] cs : board) {
            System.out.println(Arrays.toString(cs));

        }

    }

    static boolean solve(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    for (char value = '1'; value <= '9'; value++) {
                        if (help(i, j, value, board)) {
                            board[i][j] = value;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }

                        }

                    }
                    return false;
                }

            }

        }

        return true;
    }

    static boolean help(int r, int c, char value, char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == value) {
                return false;
            }
            if (board[i][c] == value) {
                return false;
            }
            if (board[(3 * (r / 3)) + r / 3][(3 * (c / 3)) + c % 3] == value) {
                return false;
            }

        }
        return true;
    }

}
