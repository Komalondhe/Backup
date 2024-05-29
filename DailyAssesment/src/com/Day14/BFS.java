package com.Day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {
	public static void bfs(Map<Integer,List<Integer>>graph,int start) {
		boolean[]visited=new boolean[graph.size()];
		Queue<Integer>queue=new LinkedList<>();
		visited[start]=true;
		queue.add(start);
		while(!queue.isEmpty()) {
		int node=queue.poll();
		System.out.println(node);
		for(int neighbor:graph.get(node)) {
			if(!visited[neighbor]) {
				visited[neighbor]=true;
				queue.add(neighbor);
			}
		}
		}
	}

	public static void main(String[] args) {
		Map<Integer,List<Integer>>graphMap=new HashMap<>();
		graphMap.put(0, Arrays.asList(1,2));
		graphMap.put(1, Arrays.asList(0,3,4));
		graphMap.put(2, Arrays.asList(0,5));
		graphMap.put(3, Arrays.asList(1));
		graphMap.put(4, Arrays.asList(1,5));
		graphMap.put(5, Arrays.asList(2,4));
		bfs(graphMap, 0);
		
	}

}
