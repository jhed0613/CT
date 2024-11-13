import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Graph {
    void a_dfs(ArrayList<Integer>[] graph, int[] visited, int[] edgeTo, int v){
        visited[v] = 1;
        System.out.print(v + " "); // 방문 정점 출력
        for (int w : graph[v]){
            if (visited[w] == 0) {
                edgeTo[w] = v;
                a_dfs(graph, visited, edgeTo, w);
            }
        }
    }
    void dfs(ArrayList<Integer>[] graph, int v){
        int n = graph.length;;
        int[] visited = new int[n];
        int[] edgeTo = new int[n];
        a_dfs(graph, visited, edgeTo, v);
    }

    void bfs(ArrayList<Integer>[] graph, int s){
        int n = graph.length;
        int[] visited = new int[n];
        int[] edgeTo = new int[n];
        visited[s] = 1;
        System.out.print(s + " ");
        Deque<Integer> q = new LinkedList<>(); // 큐는 연결리스트로 !
        q.add(s);

        while (!q.isEmpty()){
            int v = q.poll();
            for (int w : graph[v]){
                if (visited[w] == 0){
                    visited[w] = 1;
                    System.out.print(w + " "); // 방문 정점 출력
                    edgeTo[w] = v;
                    q.add(w);
                }
            }
        }
    }
}
