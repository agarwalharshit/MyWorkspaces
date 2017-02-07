package com.stack;

import java.util.NoSuchElementException;

public class Stack {
int top;
public Stack(){
	top=-1;
}
private char a[] = new char[10];
	
	public void push(char data){
	if(top<(a.length-1)){
		a[++top]=data;
	}else{
		throw new NoSuchElementException("Overflow");
	}
	}
	public char peek(){
		if(top>=0){
			return a[top];
		}else{
			throw new NoSuchElementException("Overflow");
		}
	}
	
	public char pop(){
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
