import java.util.*;

public class CircularDependency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<List<Integer>> edges = new ArrayList<>();
        System.out.println();

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges.add(Arrays.asList(a, b));
        }

        CircularDependency checker = new CircularDependency();
        boolean hasCycle = checker.hasCircularDependency(n, edges);

        if (hasCycle) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }

    public boolean hasCircularDependency(int n, List<List<Integer>> edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (List<Integer> edge : edges)
            graph.get(edge.get(0)).add(edge.get(1));

        int[] visited = new int[n];

        for (int i = 0; i < n; i++)
            if (dfs(i, graph, visited)) return true;

        return false;
    }

    private boolean dfs(int node, List<List<Integer>> graph, int[] visited) {
        if (visited[node] == 1) return true;
        if (visited[node] == 2) return false; 

        visited[node] = 1;

        for (int neighbor : graph.get(node))
            if (dfs(neighbor, graph, visited)) return true;

        visited[node] = 2;
        return false;
    }
}

