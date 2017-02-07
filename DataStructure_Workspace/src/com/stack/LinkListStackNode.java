package com.stack;

public class LinkListStackNode {
int data;
LinkListStackNode next;

public LinkListStackNode(int data){
	this.data=data;
	next=null;
}
public LinkListStackNode(int data, LinkListStackNode next){
	this.data=data;
	this.next=next;
}
	
}
