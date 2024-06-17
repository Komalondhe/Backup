package com.Day15;

public class CycleDetection {
	private int[] parent;
	private int [] rank;
	public CycleDetection(int size) {
		parent=new int[size];
		rank=new int[size];
		for(int i=0;i<size;i++) {
			parent[i]=i;
			rank[i]=0;
			
		}
	}
	public int find(int node) {
		if(parent[node] !=node) {
			parent[node]=find(parent[node]);
			
		}
		return parent[node];
		
	}
	public void union(int node1,int node2) {
		int root1=find(node1);
		int root2=find(node2);
		if(root1 !=root2) {
			if(rank[root1]>rank[root2]) {
				parent[root2]=root1;
				
			}
			else if(rank[root1]<rank[root2]) {
				parent[root1]=root2;
			}
			else {
				parent[root2]=root1;
				rank[root1]++;
			}
		}
		
		
	}
public boolean hasCycle(int[][] edges) {
	for(int [] edge:edges) {
		int u=edge[0];
		int v=edge[1];
		
		int rootU=find(u);
		int rootV=find(v);
		if(rootU==rootV) {
			return true;
		}
		union(u, v);
	}
	return false;
}
	public static void main(String[] args) {
		int[][] edges= {
				{0,1},
				{1,2},
				{2,3},
				{3,4},
				{4,2}
				
		};
		int numVertices=5;
		CycleDetection cycleDetection=new CycleDetection(numVertices);
		if(cycleDetection.hasCycle(edges)) {
			System.out.println("Cycle detected in the graph");
		}
		else {
			System.out.println("Cycle not detectd in the graph");
		}
		

	}

}
