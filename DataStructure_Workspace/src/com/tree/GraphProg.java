package com.tree;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

import com.queue.QueueUsingArray;

public class GraphProg {

	public static void main(String[] args) {
	GraphNode gn1 = new GraphNode(1);
	GraphNode gn2 = new GraphNode(2);
	GraphNode gn3 = new GraphNode(3);
	GraphNode gn4 = new GraphNode(4);
	GraphNode gn5 = new GraphNode(5);
	GraphNode gn6 = new GraphNode(6);
	GraphNode gn7 = new GraphNode(7);
	GraphNode gn8 = new GraphNode(8);
	
	gn6.addChild(gn7);
	gn6.addChild(gn8);
	
	gn4.addChild(gn5);
	gn4.addChild(gn6);
	
	gn1.addChild(gn2);
	gn1.addChild(gn3);
	gn1.addChild(gn4);
	gn1.addChild(gn5);
	GraphProg g = new GraphProg();
	g.bFS(gn1,gn8);

	}
	
	void bFS(GraphNode src, GraphNode dest){
		
		PriorityQueue<GraphNode> q1 = new PriorityQueue<GraphNode>();
		GraphNode x;
		q1.add(src);
		while(!q1.isEmpty()){
			x=q1.remove();
			if(x.getValue()==dest.getValue()){
				System.out.println("Node Found");
				break;
			}else{
				for(GraphNode aa : x.getChilds()){
					q1.add(aa);
				}
					
			}
		}
	}

}
