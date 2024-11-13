import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Kruskal {
    public int kruskal(int n, List<int[]> edges){
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e[0]));

        pq.addAll(edges);

        UnionFind uf = new UnionFind(n);
        int min = 0;
        int useEdge = 0;

        while(!pq.isEmpty() && useEdge < n-1){
            int[] edge = pq.poll();
            int w = edge[0];
            int u = edge[1];
            int v = edge[2];

            if (uf.find(u) != uf.find(v)){
                uf.unionSet(u,v);
                min += w;
                useEdge++;
            }
        }
        return (useEdge == n - 1) ? min : -1;

    }
}
