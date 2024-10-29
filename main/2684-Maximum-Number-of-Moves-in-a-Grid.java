class Solution {
    public int maxMoves(int[][] grid) {
        int moves = 0;
        int m = grid[0].length;
        int n = grid.length;
        int[] rowArray = {-1, 0, 1}; 
        boolean[][] visited = new boolean[n][m]; 
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(new int[]{i, 0}); 
            visited[i][0] = true;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean moveMade = false; 
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                for (int j = 0; j < rowArray.length; j++) {
                    int newRow = row + rowArray[j];
                    int newCol = col + 1;

                  
                    if (newRow >= 0 && newRow < n && newCol < m && 
                        !visited[newRow][newCol] && grid[newRow][newCol] > grid[row][col]) {
                        queue.add(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                        moveMade = true;
                    }
                }
            }
            if (moveMade) {
                moves++;
            }
        }

        return moves;
    }
}
