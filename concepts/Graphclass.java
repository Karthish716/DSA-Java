package sample2;

import java.util.*;

public class Graphclass {
	
	ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
	Graphclass(int v){
		for(int i=0;i<v;i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int u,int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	public void printadjList() {
		for(int i=0;i<adjList.size();i++) {
			System.out.println("Adj list of vertyex "+ i);
			for(int j=0;j<adjList.get(i).size();j++) {
				System.out.println(" "+adjList.get(i).get(j));
			}
		}
		
	}
	
	public void bfs(int v) {
		int V = adjList.size();
		boolean[] visited = new boolean[V];
		visited[v] = true;
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(v);
		while(q.size()!=0) {
			int vertex = q.remove();
			System.out.print(" "+vertex);
			for(int i=0;i<adjList.get(vertex).size();i++) {
				int av= adjList.get(vertex).get(i);
				if(!visited[av]) {
					q.add(av);
					visited[av]=true;
				}
			}
		}	
	}
	
	
           
}
