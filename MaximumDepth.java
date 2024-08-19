import java.util.*;

public class MaximumDepth {
    public ArrayList<Integer> solve(int A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E, ArrayList<Integer> F) {
        // Create adjacency list for the tree
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            tree.add(new ArrayList<>());
        }
        for (int i = 0; i < B.size(); i++) {
            tree.get(B.get(i) - 1).add(C.get(i) - 1);
            tree.get(C.get(i) - 1).add(B.get(i) - 1);
        }

        // Store node values
        int[] values = new int[A];
        for (int i = 0; i < A; i++) {
            values[i] = D.get(i);
        }

        // Level information storage
        List<List<Integer>> levels = new ArrayList<>();
        for (int i = 0; i <= A; i++) {
            levels.add(new ArrayList<>());
        }

        // BFS to determine levels of each node
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[A];
        queue.add(new int[]{0, 0}); // {node, level}
        visited[0] = true;

        int maxDepth = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int level = current[1];

            maxDepth = Math.max(maxDepth, level);
            levels.get(level).add(values[node]);

            for (int neighbor : tree.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new int[]{neighbor, level + 1});
                }
            }
        }

        // Sort each level for quick search of the smallest value >= X
        for (List<Integer> level : levels) {
            Collections.sort(level);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < E.size(); i++) {
            int levelQuery = E.get(i) % (maxDepth + 1);
            int xQuery = F.get(i);

            // Find the smallest value >= xQuery using binary search
            List<Integer> currentLevel = levels.get(levelQuery);
            int index = Collections.binarySearch(currentLevel, xQuery);
            if (index < 0) {
                index = -index - 1;
            }

            if (index < currentLevel.size()) {
                result.add(currentLevel.get(index));
            } else {
                result.add(-1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 4, 3, 1));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(5, 2, 4, 4));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(7, 38, 27, 37, 1));
        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(1, 1, 2));
        ArrayList<Integer> F = new ArrayList<>(Arrays.asList(32, 18, 26));

        System.out.println(sol.solve(5, B, C, D, E, F)); // Output: [37, 37, 27]

        B = new ArrayList<>(Arrays.asList(1, 2));
        C = new ArrayList<>(Arrays.asList(3, 1));
        D = new ArrayList<>(Arrays.asList(7, 15, 27));
        E = new ArrayList<>(Arrays.asList(1, 10, 1));
        F = new ArrayList<>(Arrays.asList(29, 6, 26));

        System.out.println(sol.solve(3, B, C, D, E, F)); // Output: [-1, 7, 27]
    }
}
