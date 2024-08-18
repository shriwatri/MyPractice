import java.util.ArrayList;

public class FirstDepthFirstSearch {
    public int solve(ArrayList<Integer> A, final int B, final int C) {
        // Adjust C to 0-based index
        int start = C - 1;
        int target = B - 1;

        // If start and target are the same, it's reachable
        if (start == target) {
            return 1;
        }

        // Create a visited array to track visited nodes
        boolean[] visited = new boolean[A.size()];

        // Perform DFS from the starting node
        return dfs(A, start, target, visited) ? 1 : 0;
    }

    private boolean dfs(ArrayList<Integer> A, int current, int target, boolean[] visited) {
        // Mark the current node as visited
        visited[current] = true;

        // Find the next node using the directed edge in A
        int next = A.get(current) - 1;

        // If the next node is the target, return true
        if (next == target) {
            return true;
        }

        // If the next node is not visited, continue DFS
        if (!visited[next]) {
            return dfs(A, next, target, visited);
        }

        // If no path is found, return false
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(2);

        System.out.println(sol.solve(A, 1, 2)); // Output: 0
        System.out.println(sol.solve(A, 2, 1)); // Output: 1
    }
}
