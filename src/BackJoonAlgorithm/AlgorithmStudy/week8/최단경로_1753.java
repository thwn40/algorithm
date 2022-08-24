package BackJoonAlgorithm.AlgorithmStudy.week8;

import java.util.*;

public class 최단경로_1753 {
    static final int INF = Integer.MAX_VALUE;
    static int[] distTable;
    static ArrayList<Node>[] Graph;
    static int u, v, dist, V, E, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        //출발점으로부터의 최단거리를 저장할 배열 distTable
        distTable = new int[V];
        Graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            Graph[i] = new ArrayList<>();
        }
        E = sc.nextInt();

        K = sc.nextInt() - 1;
        for (int i = 0; i < E; i++) {
            u = sc.nextInt() - 1;
            v = sc.nextInt() - 1;
            dist = sc.nextInt();
            Graph[u].add(new Node(v, dist));
        }

        dijkstra();
        for (int i : distTable) {
            if (i == INF) {
                System.out.println("INF");
            } else {
                System.out.println(i);
            }
        }

    }

    static void dijkstra() {
        //출발노드에는 0을, 출발점을 제외한 다른 노드들에는 INF로 초기화
        Arrays.fill(distTable, INF);
        distTable[K] = 0;

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(K, 0));

        while (!queue.isEmpty()) {
            //현재 노드
            Node cur = queue.poll();
            int currSource = cur.vertex;
            int currDist = cur.dist;

            //현재노드까지의 거리ㅂ
            if (distTable[currSource] < currDist) {
                continue;
            }

            for (int v = 0; v < Graph[currSource].size(); v++) {

                Node nextNode = Graph[currSource].get(v);

                if (distTable[nextNode.vertex] <= nextNode.dist + currDist) continue;

                distTable[nextNode.vertex] = nextNode.dist + currDist;
                queue.add(new Node(nextNode.vertex, nextNode.dist + currDist));
            }

        }


    }

    static class Node implements Comparable<Node> {
        int vertex;
        int dist;

        public Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.dist, o.dist);
        }
    }
}
