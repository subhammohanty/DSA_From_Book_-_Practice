package problem_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphImpl {
	
	private LinkedList<Integer> adjacency[];
	
	public GraphImpl(int v) {
		adjacency = new LinkedList[v];
		for(int i =0; i<v; i++) {
			adjacency[i] = new LinkedList<Integer>();
		}
	}
	
	public void insertEdge(int s , int d) {
		adjacency[s].add(d);
		adjacency[d].add(s);
	}
	
	
	//DFS : Using Stack
	public void dfs(int source) {
		boolean visited_nodes[] = new boolean[adjacency.length];
		int parent_nodes[] = new int[adjacency.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(source);
		visited_nodes[source] = true;
		parent_nodes[source] = -1;
		
		while(!stack.isEmpty()) {
			int p = stack.pop();
			System.out.println(p);
			for(int i : adjacency[p]) {
				if(visited_nodes[i] != true) {
					visited_nodes[i] = true;
					stack.push(i);
					parent_nodes[i] = p;
				}
			}
		}
	}
	
	//BFS:Using Queue
	public void bfs(int source) {
		boolean visited_nodes[] = new boolean[adjacency.length];
		int parent_nodes[] = new int[adjacency.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		visited_nodes[source] = true;
		parent_nodes[source] = -1;
		while(!queue.isEmpty()) {
			int p = queue.poll();
			System.out.println(p);
			for(int i : adjacency[p]) {
				if(visited_nodes[i] != true) {
					visited_nodes[i] = true;
					queue.add(i);
					parent_nodes[i] = p;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vertex and Edges :");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		GraphImpl graph = new GraphImpl(v);
		System.out.println("Enter Edges : ");
		for(int i =0; i < e; i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			graph.insertEdge(s, d);
		}
		System.out.println("Enter Source : ");
		int source = sc.nextInt();
		System.out.println("DFS :");
		graph.dfs(source);
		System.out.println("BFS :");
		graph.bfs(source);
	}

}
