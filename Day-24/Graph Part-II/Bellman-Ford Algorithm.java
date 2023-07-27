class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        // Initialize distance of all vertices as infinite.
        int[] dis = new int[V];
        int inf=100000000;
        for (int i = 0; i < V; i++) dis[i] = 100000000;

        // initialize distance of source as 0
        dis[S] = 0;

        // Relax all edges |V| - 1 times. A simple
        // shortest path from src to any other
        // vertex can have at-most |V| - 1 edges
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < edges.size(); j++) {
                if (dis[edges.get(j).get(0)]!=inf && dis[edges.get(j).get(0)] + edges.get(j).get(2) <
                        dis[edges.get(j).get(1)])
                    dis[edges.get(j).get(1)] =
                        dis[edges.get(j).get(0)] + edges.get(j).get(2);
            }
        }
        for (int j = 0; j < edges.size(); j++) {
            if (dis[edges.get(j).get(0)]!=inf && dis[edges.get(j).get(0)] + edges.get(j).get(2) <
                    dis[edges.get(j).get(1)]) {
                return new int[]{-1};
            }
        }
        return dis;
    }
}
