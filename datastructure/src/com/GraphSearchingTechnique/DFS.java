package com.GraphSearchingTechnique;

import java.util.Iterator;
import java.util.LinkedList;


	class DFS{
		private int V;
		private LinkedList<Integer>adj[];
		@SuppressWarnings("unchecked")public DFS(int v){
			V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;++i)
			adj[i]=new LinkedList();
		
		}
	void addEdge(int V,int W) {
		adj[V].add(W);
	}
	void DFSUtil(int V,boolean visited[]) {
		visited[V]=true;
		System.out.println(V+" ");
		Iterator<Integer>iterator=adj[V].listIterator();
		while(iterator.hasNext()) {
			int n=iterator.next();
			if(!visited[n])
				DFSUtil(n, visited);
		}
	}
	void DFS(int v) {
		boolean Visited[]=new boolean[V];
		DFSUtil(v,Visited);
	}
	

	public static void main(String[] args) {
		DFS graph=new DFS(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		System.out.println("Following is depth first first traversal:"+"(Starting from vertex 2)");
		graph.DFS(2);
	}
		

	}


