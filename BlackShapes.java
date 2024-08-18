import java.util.ArrayList;

public class BlackShapes {

    public int black(ArrayList<String> A) {
        int n = A.size();
        if (n == 0) return 0;
        int m = A.get(0).length();

        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A.get(i).charAt(j) == 'X' && !visited[i][j]) {
                    dfs(A, visited, i, j, n, m);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(ArrayList<String> A, boolean[][] visited, int i, int j, int n, int m) {
        // Boundary and visited check
        if (i < 0 || i >= n || j < 0 || j >= m || A.get(i).charAt(j) != 'X' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        // Explore in all 4 directions (up, down, left, right)
        dfs(A, visited, i + 1, j, n, m); // down
        dfs(A, visited, i - 1, j, n, m); // up
        dfs(A, visited, i, j + 1, n, m); // right
        dfs(A, visited, i, j - 1, n, m); // left
    }

    public static void main(String[] args) {
        BlackShapes solution = new BlackShapes();

        ArrayList<String> board1 = new ArrayList<>();
        board1.add("XXX");
        board1.add("XXX");
        board1.add("XXX");

        ArrayList<String> board2 = new ArrayList<>();
        board2.add("XO");
        board2.add("OX");

        System.out.println("Number of black shapes in board 1: " + solution.black(board1)); // Output: 1
        System.out.println("Number of black shapes in board 2: " + solution.black(board2)); // Output: 2
    }
}
