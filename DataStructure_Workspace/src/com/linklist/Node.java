package com.linklist;

class Node {
	int data;
	Node next;
	
	Node(){
		next=null;
	}
	Node(int data){
		next=null;
		this.data=data;
	}
	public Node(int data, Node link){
		this.next=link;
		this.data=data;
	}
Node next(){
	return next;
}
int data(){
	return data;
}
}
