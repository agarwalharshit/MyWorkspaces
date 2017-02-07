package com.stack;

import java.util.NoSuchElementException;

import com.tree.Node;

public class StackForInt {
int top;
public StackForInt(){
	top=-1;
}
private Node a[] = new Node[10];
	
	public void push(Node data){
	if(top<(a.length-1)){
		a[++top]=data;
	}else{
		throw new NoSuchElementException("Overflow");
	}
	}
	public Node peek(){
		if(top>=0){
			return a[top];
		}else{
			throw new NoSuchElementException("Overflow");
		}
	}
	
	public Node pop(){
		if(top>=0){
			return a[top--];
		}else{
				throw new NoSuchElementException("Underflow");
		
			}
		}
	public boolean isEmpty(){
		return top==-1;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	

}
