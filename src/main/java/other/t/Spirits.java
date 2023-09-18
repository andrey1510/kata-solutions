package other.t;

import java.util.Scanner;

public class Spirits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        UnionFind unionFind = new UnionFind(n);

        for (int i = 0; i < m; i++) {
            int queryType = scanner.nextInt();

            if (queryType == 1) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                unionFind.union(x, y);
            } else if (queryType == 2) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                boolean isInSameBand = unionFind.find(x) == unionFind.find(y);
                System.out.println(isInSameBand ? "YES" : "NO");
            } else if (queryType == 3) {
                int x = scanner.nextInt();
                int bandCount = unionFind.getBandCount(x);
                System.out.println(bandCount);
            }
        }

        scanner.close();
    }

    static class UnionFind {
        private int[] parent;
        private int[] size;

        public UnionFind(int n) {
            parent = new int[n + 1];
            size = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                if (size[rootX] > size[rootY]) {
                    parent[rootY] = rootX;
                    size[rootX] += size[rootY];
                } else {
                    parent[rootX] = rootY;
                    size[rootY] += size[rootX];
                }
            }
        }

        public int getBandCount(int x) {
            int root = find(x);
            return size[root];
        }
    }
}
