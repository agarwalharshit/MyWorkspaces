package com.stack;

public class StackUsingLinkList {
	LinkListStackNode top;
	public StackUsingLinkList(){
		top=null;
	}
	
	public void push(int data){
		top=new LinkListStackNode(data, top);
		
	}
	public int pop(){
	int data=top.data;
	top=top.next;
	return data;
	}
	
	public boolean isEmpty(){
		return top==null;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingLinkList stack = new StackUsingLinkList();
		stack.push(2);
		

	}

}
