package com.ctci;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Chap2LinkesList {
	LinkedListNode<Integer> ll= new LinkedListNode<Integer>();
	public static void main(String[] args) {
		//LinkedListNode<Integer> ll= new LinkedListNode<Integer>(5);
		
		Chap2LinkesList ch = new Chap2LinkesList();
		ch.ll.addNode(9);
		ch.ll.addNode(11);
		ch.ll.addNode(4);
		ch.ll.addNode(4);
		ch.ll.addNode(11);
		ch.ll.addNode(9);
		
		LinkedList ll= new LinkedList();
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.pop();
		s.pop();
		//s.isEmpty()
		
		//LinkedListNode<Integer> toBeDeleted= new LinkedListNode<Integer>(3);
		
		if(ch.ll==null){
			return;
		}
		//Chap2LinkesList ch = new Chap2LinkesList();
	//	LLResult res=ch.q6pallendrome(ch.ll,ch.ll);
		//System.out.println(res.result);
//		ch.ll=res.node;
//		while(ch.ll!=null){
//			System.out.println(ch.ll.data);
//			ch.ll=ch.ll.next;
//		}
		
	}
	
	
	
	
	

	LinkedListNode<Integer> q4partitioning(LinkedListNode<Integer> node,int toBeDeleted){
		LinkedListNode<Integer> current=node;
		LinkedListNode<Integer> slow=node;
		if(node==null){
			return node;
		}
		while(current!=null){
			if(current.data>=toBeDeleted){
				current=current.next;
		}else{
			int temp=slow.data;
			slow.data=current.data;
			current.data=temp;
			current=current.next;
			slow=slow.next;
		}
		}
		return node;
	}	
	
	
	LinkedListNode<Integer> q3DeleteFromMiddle(LinkedListNode<Integer> node,LinkedListNode<Integer> toBeDeleted){
		LinkedListNode<Integer> current=node;
		if(node==null || toBeDeleted==null){
			return node;
		}
		if(node.data==toBeDeleted.data){
			return null;
		}
		while(current.next!=null){
			if(current.next.data==toBeDeleted.data){
				current.next=current.next.next;
				return node;
			}else{
				current=current.next;
			}
		}
		return node;
	}
	
	
	public LinkedListNode<Integer> q1RemoveDups(LinkedListNode<Integer> node){
		LinkedListNode<Integer> p1=node;
		LinkedListNode<Integer> p2=node;
		HashSet<Integer> hs = new HashSet<Integer>();
		while(p1!=null){
			if(hs.contains(p1.data)){
				p2.next=p1.next;
				p1.next=null;
				p1=p2.next;
			}else{
				hs.add(p1.data);
				p2=p1;
				p1=p1.next;
			}
		}
		return node;
	}
	
	public LinkedListNode<Integer> q1RemoveDupsMethod2(LinkedListNode<Integer> node){
		LinkedListNode<Integer> p1=node;
		LinkedListNode<Integer> p2=node;
		while(null!=p1){
			p2=p1;
			while( null!=p2.next){
				if(p2.next.data==p1.data){
					p2.next=p2.next.next;
				}else{
				p2=p2.next;}
			}
			p1=p1.next;
		}
		return node;
	}
	
	
	
}