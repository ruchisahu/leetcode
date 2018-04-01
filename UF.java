public class UF {

    private int[] parent;  // parent[i] = parent of i
    private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
    private int count;     // number of components

   
    public UF(int n) {
        if (n < 0) throw new IllegalArgumentException();
        count = n;
        parent = new int[n];
        rank = new byte[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

   
    public int find(int p) {
        validate(p);
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];    // path compression by halving
            p = parent[p];
        }
        return p;
    }

    /**
     * Returns the number of components.
     *
     * @return the number of components (between {@code 1} and {@code n})
     */
    public int count() {
        return count;
    }
  

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
  
    
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make root of smaller rank point to root of larger rank
        if      (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
        else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
        else {
            parent[rootQ] = rootP;
            rank[rootP]++;
        }
        count--;
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));  
        }
    }
   void countIslands(int a[][])
    {
        int n = a.length;
        int m = a[0].length;
        UF uf=new UF(n*m);
        for (int j=0; j<n; j++)
        {
            for (int k=0; k<m; k++)
            {
                
                if (a[j][k] == 0)
                    continue;
             if (j+1 < n && a[j+1][k]==1)
                    uf.union(j*(m)+k, (j+1)*(m)+k);
                if (j-1 >= 0 && a[j-1][k]==1)
                    uf.union(j*(m)+k, (j-1)*(m)+k);
                if (k+1 < m && a[j][k+1]==1)
                    uf.union(j*(m)+k, (j)*(m)+k+1);
                if (k-1 >= 0 && a[j][k-1]==1)
                    uf.union(j*(m)+k, (j)*(m)+k-1);
                if (j+1<n && k+1<m && a[j+1][k+1]==1)
                    uf.union(j*(m)+k, (j+1)*(m)+k+1);
                if (j+1<n && k-1>=0 && a[j+1][k-1]==1)
                    uf.union(j*m+k, (j+1)*(m)+k-1);
                if (j-1>=0 && k+1<m && a[j-1][k+1]==1)
                    uf.union(j*m+k, (j-1)*m+k+1);
                if (j-1>=0 && k-1>=0 && a[j-1][k-1]==1)
                    uf.union(j*m+k, (j-1)*m+k-1);
            }
        }
     int[] c = new int[n*m];
        int numberOfIslands = 0;
        for (int j=0; j<n; j++)
        {
            for (int k=0; k<m; k++)
            {
                if (a[j][k]==1)
                {
 
                    int x = uf.find(j*m+k);
 
                    if (c[x]==0)
                    {
                        numberOfIslands++;
                        c[x]++;
                    }
 
                    else
                        c[x]++;
                }
            }
        }
        System.out.println( numberOfIslands);
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
