package other.t;

import java.util.*;

public class Chougen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<List<int[]>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int v = scanner.nextInt();
            int u = scanner.nextInt();
            int w = scanner.nextInt();

            graph.get(v).add(new int[] { u, w });
            graph.get(u).add(new int[] { v, w });
        }

        int x = chooseNumber(graph, n);
        System.out.println(x);

        scanner.close();
    }

    public static int chooseNumber(List<List<int[]>> graph, int n) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int distance = bfs(graph, i, n);

            if (distance > 0) {
                minDistance = Math.min(minDistance, distance);
            }
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }

    public static int bfs(List<List<int[]>> graph, int start, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        boolean[] visited = new boolean[n + 1];
        visited[start] = true;

        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int city = queue.poll();

                for (int[] road : graph.get(city)) {
                    int neighbor = road[0];
                    int roadLength = road[1];

                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                        distance = Math.max(distance, roadLength);
                    }
                }
            }
        }

        return distance;
    }
}
