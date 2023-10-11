package leetcode.problems.java;

    public class backtracking {
        public static void main(String[] args) {
           /* int[][] board = new int[][]{
                    {4, 0, 0, 9, 7, 0, 0, 0, 0},
                    {0, 9, 7, 0, 5, 0, 0, 6, 0},
                    {2, 0, 0, 0, 0, 0, 7, 0, 0},
                    {0, 0, 0, 0, 0, 3, 0, 4, 0},
                    {0, 0, 2, 0, 0, 0, 0, 0, 0},
                    {0, 7, 5, 1, 0, 0, 3, 0, 0},
                    {0, 1, 3, 5, 0, 0, 4, 0, 0},
                    {9, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 6, 0, 0, 0, 8}
            };

            if (solve(board)) {
                display(board);
            } else {
                System.out.println("Cannot solve");
            }

        }

        static boolean solve(int[][] board) {
            int n = board.length;
            int row = -1;
            int col = -1;

            boolean emptyLeft = true;

            // this is how we are replacing the r,c from arguments
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 0) {
                        row = i;
                        col = j;
                        emptyLeft = false;
                        break;
                    }
                }
                // if you found some empty element in row, then break
                if (emptyLeft == false) {
                    break;
                }
            }
            return emptyLeft;
        }

            */
        }

    }