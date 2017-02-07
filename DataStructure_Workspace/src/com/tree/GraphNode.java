package com.tree;

import java.util.ArrayList;

public class GraphNode {
	char value;
	boolean isTraversed=false;
	ArrayList<GraphNode> childs= new ArrayList<GraphNode>();  
	
	GraphNode(char i){
		value=i;
	}
	void addChild(GraphNode gn){
		childs.add(gn);
	}
	
	public char getValue() {
		return value;
	}


	public void setValue(char value) {
		this.value = value;
	}


	public ArrayList<GraphNode> getChilds() {
		return childs;
	}


	public void setChilds(ArrayList<GraphNode> childs) {
		this.childs = childs;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
