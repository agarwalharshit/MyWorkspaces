package com.ctci;

public class LinkedListNode<K> {
	K data;
	LinkedListNode<K> next;
	public LinkedListNode(){
		next=null;
	}
	public LinkedListNode(K data){
		this.data=data;
		next=null;
	}
	public LinkedListNode(K data, LinkedListNode<K> next){
		this.data=data;
		this.next=next;
	}
	void addNode(K newNode){
		LinkedListNode<K> nn = new LinkedListNode<K>(newNode);
		LinkedListNode<K> temp=this;
		
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=nn;
			
	}
	
	public K getData() {
		return data;
	}
	public void setData(K data) {
		this.data = data;
	}
	public LinkedListNode<K> getNext() {
		return next;
	}
	public void setNext(LinkedListNode<K> next) {
		this.next = next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}