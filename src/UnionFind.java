public class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int n){
        parent = new int[n];
        rank = new int[n];
        for (int i=0; i<n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }
    public int find(int x){
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void unionSet(int a, int b){
        int p = find(a);
        int q = find(b);
        if (p != q){
            if (rank[p] < rank[q]){
                parent[p] = q;
            }else if (rank[p] > rank[q]){
                parent[q] = p;
            }else{
                parent[q] = p;
                rank[p]++;
            }
        }
    }

}
