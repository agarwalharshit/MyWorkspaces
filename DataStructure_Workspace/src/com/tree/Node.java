package com.tree;

public class Node {
	int data;
	int lcount;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
		left=right=null;
		lcount=0;
	}
	Node(){
		left=right=null;
		lcount=0;
	}

}
