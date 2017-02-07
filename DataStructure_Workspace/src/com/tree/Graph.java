package com.tree;

import java.util.ArrayList;

public class Graph {
	public int data=-1;
	public ArrayList<Graph> childs=null;
	public boolean	isTraversed= false;
	
	public Graph(int data){
		this.data= data;
	}
	
	
	
	
	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public ArrayList<Graph> getChilds() {
		return childs;
	}



	public void setChilds(ArrayList<Graph> childs) {
		this.childs = childs;
	}



	public boolean isTraversed() {
		return isTraversed;
	}



	public void setTraversed(boolean isTraversed) {
		this.isTraversed = isTraversed;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
