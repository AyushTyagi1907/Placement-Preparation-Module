class Solution{
	static int spanningTree(int V, int E, int edges[][]){
        Arrays.sort(edges, 
			new Comparator<int[]>(){
				public int compare(int x[], int y[]){
					return x[2] - y[2];
				}
			}
		);
		int ans = 0;
		DSU dsu = new DSU(V);
		for(int i = 0; i < E; i++){
			if(dsu.union(edges[i][0], edges[i][1]))
				ans += edges[i][2];
		}
		return ans;
    }
	
}
class DSU{
	int n;
	int par[], rank[];
	DSU(int n){
		this.n = n;
		this.par = new int[n];
		this.rank = new int[n];
		for(int i = 0; i < n; i++)
			par[i] = i;
	}
	int find(int node){
		if(par[node] == node)
			return node;
		return par[node] = find(par[node]);
	}
	boolean union(int u, int v){
		u = find(u);
		v = find(v);
		if(u == v)
			return false;
		if(rank[u] > rank[v]){
			par[v] = u;
		} else if(rank[u] < rank[v]){
			par[u] = v;
		} else{
			par[u] = v;
			rank[v]++;
		}
		return true;
	}
}
