package com.GraphAlgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DijktraAlgorithm {
	private static class Node implements Comparable<Node>{
		int vertex;
		int distance;
		Node(int vertex,int distance){
			this.vertex=vertex;
			this.distance=distance;
			
		}
		@Override
		public int compareTo(Node other) {
		return Integer.compare(this.distance, other.distance);
		}
		
	}
	public static void dijktra(int[][]graph,int source) {
		int V=graph.length;
		int[]dist=new int[V];
		boolean[] Visited=new boolean[V];
		PriorityQueue<Node>pQueue=new PriorityQueue<>();
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source]=0;
		while(!pQueue.isEmpty()) {
			Node node=pQueue.poll();
		int u=node.vertex;
		if(Visited[u])continue;
		Visited[u]=true;
		for(int v=0;v<V;v++) {
			if(!Visited[v]&& graph[u][v]!=0 && dist[u]+graph[u][v]<dist[v]) {
				dist[v]=dist[u]+graph[u][v];
				pQueue.add(new Node(v, dist[v]));
			}
			
		}
		}
		printSolution(dist,source);
	}
	public static void printSolution(int []dist,int source) {
		System.out.println("vertex/distance from source:"+source);
		for(int i=0;i<dist.length;i++) {
			System.out.println(i+"\t\t"+dist[i]);
		}
	}

	public static void main(String[] args) {
		
		int [][] graph=new int[][] {
			{0,10,20,0,0},
			{10,0,0,50,10},
			{20,0,0,20,33},
			{0,30,20,0,2},
			{0,10,33,2,0}
		};
		dijktra(graph, 0);

	}

}
