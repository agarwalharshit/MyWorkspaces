package com.linklist;

import java.util.NoSuchElementException;

public class Linklist {
	Node head=null;
	Node last=null;
	public Linklist(){
		head=null;
	}
	
	public void insertAtHead(int data){
		Node n1=new Node(data);
		if(head==null){
			head=n1;
			last=n1;
		}else{
			n1.next=head;
			head=n1;
		}

	}
	public void insertAtTail(int data){
		Node n1=new Node(data);
		if(last==null){
			last=n1;
			head=n1;
		}else{
			last.next=n1;
			last=n1;
		}
	}
	
	public Node delete(){
		if(head==null){
			throw new NoSuchElementException();
		}else{
			Node n1=head;
			head=head.next();
			return n1;
		}
	}
	
	public void print(){
		Node counter=head;
		while(counter!=null){
			System.out.print(counter.data()+" ");
			counter= counter.next();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

	}

}
