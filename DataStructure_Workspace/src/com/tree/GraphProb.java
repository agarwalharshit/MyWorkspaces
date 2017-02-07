package com.tree;

import java.util.LinkedList;

public class GraphProb {
	LinkedList<GraphNode> ll= new LinkedList<GraphNode>();

	public static void main(String[] args) {
	GraphNode g1= new GraphNode(1);
	GraphNode g2= new GraphNode(2);
	GraphNode g3= new GraphNode(3);
	GraphNode g4= new GraphNode(4);
	GraphNode g5= new GraphNode(5);
	GraphNode g6= new GraphNode(6);
	GraphNode g7= new GraphNode(7);
	GraphNode g8= new GraphNode(8);
	GraphNode g9= new GraphNode(9);
	g1.childs.add(g2);
	g2.childs.add(g3);
	g2.childs.add(g4);
	g3.childs.add(g4);
	g4.childs.add(g5);
	g4.childs.add(g6);
	//g6.childs.add(g7);
	g6.childs.add(g8);
	g7.childs.add(g8);
	GraphProb gp = new GraphProb();
	gp.search(g1, g7);
	}

	void search(GraphNode g1, GraphNode g8){
		LinkedList<GraphNode> ll = new LinkedList<GraphNode>();
		ll.addLast(g1);
		while(!ll.isEmpty()){
			GraphNode n=ll.pop();
			n.isTraversed=true;
			if(g8==n){
				System.out.println("True");
				return;
			}else{
				for(GraphNode g:n.childs){
					if(!g.isTraversed){
						if(g==g8){
							System.out.println("True");
							return;
						}else{
							g.isTraversed=true;
					ll.addLast(g);
					}
					}
				}
			}
	
		}
		
		System.out.println("Not found");
		
	}
	
	
}
