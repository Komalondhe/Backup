package com.Day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS {
	public static void  dfs(Map<Integer, List<Integer>>graMap,int node,boolean[]visited) {
		visited[node]=true;
		System.out.println(node);
		for(int neighbor:graMap.get(node)) {
			if(!visited[neighbor]) {
			dfs(graMap, neighbor, visited);
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer, List<Integer>>graMap=new HashMap<>();
		graMap.put(0, Arrays.asList(1,2));
		graMap.put(1, Arrays.asList(0,3,4));
		graMap.put(2, Arrays.asList(0,5));
		graMap.put(3, Arrays.asList(1));
		graMap.put(4, Arrays.asList(1,5));
		graMap.put(5, Arrays.asList(2,4));
		int numNodes=graMap.size();
		boolean[]Visited=new boolean[numNodes];
		dfs(graMap, 0, Visited);
		
	}

}
