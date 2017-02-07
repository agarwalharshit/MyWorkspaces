package com.linklist;

import java.util.HashSet;
import java.util.Stack;

public class LinkListTest {

	public static void main(String[] args) {
//	Linklist ll = new Linklist();	
//	ll.insertAtTail(1);
//	ll.insertAtTail(2);
//	ll.insertAtTail(3);
//	ll.insertAtTail(4);
//	ll.insertAtTail(5);
//	ll.insertAtTail(4);
//	ll.insertAtTail(8);
//	ll.insertAtTail(2);
//	ll.insertAtTail(1);
//	ll.print();
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		Node n7=new Node(7);
		Node n8=new Node(8);
		Node n9=new Node(9);
		Node n33=new Node(3);
		Node n22=new Node(2);
		Node n11=new Node(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n7.next=n8;
		n8.next=n9;
		n33.next=n22;
		n22.next=n11;
		n11.next=n6;
		
	LinkListTest llt = new LinkListTest();
	System.out.println(llt.bisect(n1, n33));
	//ll.print();
	}

	
	boolean bisect(Node n1, Node n2){
		int l1=9;
		int l2=7;
		for(int i=0;i<l1-l2;i++){
			n1=n1.next;
		}
		while(n1!=null && n1!=n2){
			n1=n1.next;
			n2=n2.next;
		}
		
		if(n1==n2){
			return true;
		}else{
			return false;
		}
		
	}
}