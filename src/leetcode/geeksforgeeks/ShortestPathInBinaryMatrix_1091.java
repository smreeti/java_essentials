package leetcode.geeksforgeeks;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix_1091 {

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;

        int[][] directions = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        grid[0][0] = 1; // mark visited

        int pathLength = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0], c = curr[1];

                if (r == n - 1 && c == n - 1) return pathLength;

                for (int[] d : directions) {
                    int nr = r + d[0], nc = c + d[1];

                    if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                        queue.offer(new int[]{nr, nc});
                        grid[nr][nc] = 1; // mark visited
                    }
                }
            }

            pathLength++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0},
                {1, 0, 0},
                {1, 1, 0}
        };

        System.out.println(shortestPathBinaryMatrix(grid)); // Output: 3
    }
}
