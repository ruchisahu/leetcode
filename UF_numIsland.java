/* 200 Number of Island
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */


class UF_numIsland {

public int count = 0;
public int[] id = null;

private void UF(int m, int n, char[][] grid) {
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(grid[i][j] == '1') count++;
        }
    }
    id = new int[m * n];
    for(int i = 0; i < m * n; i++) {
        id[i] = i;
    }
}

public int find(int p) {
    while(p != id[p]) {
        id[p] = id[id[p]];
        p = id[p];
    }
    return p;
}

public boolean isConnected(int p, int q) {
    int pRoot = find(p);
    int qRoot = find(q);
    if(pRoot != qRoot) return false;
    else return true;
}

public void union(int p, int q) {
    int pRoot = find(p);
    int qRoot = find(q);
    if(pRoot == qRoot) return;
    id[pRoot] = qRoot;
    count--;
}



public int numIslands(char[][] grid) {
    if(grid.length == 0 || grid[0].length == 0) return 0;
    int m = grid.length, n = grid[0].length;
    UF_numIsland uf = new UF_numIsland();
    uf.UF(m , n, grid);
    
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(grid[i][j] == '0') continue;
            int p = i * n + j;
            int q;
            if(i > 0 && grid[i - 1][j] == '1') {
                q = p - n;
                uf.union(p, q);
            }
            if(i < m - 1 && grid[i + 1][j] == '1') {
                q = p + n;
                uf.union(p, q);
            }
            if(j > 0 && grid[i][j - 1] == '1') {
                q = p - 1;
                uf.union(p, q);
            }
            if(j < n - 1 && grid[i][j + 1] == '1') {
                q = p + 1;
                uf.union(p, q);
            }
        }
    }
    return uf.count;
}


 public static void main(String[] args)
    {
        
       int[][] a = new int[][] {{1, 1, 0, 0, 0},
                                 {0, 1, 0, 0, 1},
                                 {1, 0, 0, 1, 1},
                                 {0, 0, 0, 0, 0},
                                 {1, 0, 1, 0, 1}
                                };
      int[][] a12 = new int[][] {{0, 0},
                                 {0, 0},
                                
                                };
      
       int[][] a1 = new int[][] {{1, 1, 1, 1, 0},
                                 {1, 1, 0, 1, 0},
                                 {1, 1, 0, 0, 0},
                                 {0, 0, 0, 0, 0}
                                              };
        int n = a1.length;
        int m = a1[0].length;
        UF uf=new UF(n*m);
        uf.countIslands(a1);
}
}

