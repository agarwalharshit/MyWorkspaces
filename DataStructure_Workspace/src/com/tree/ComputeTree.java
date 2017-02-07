package com.tree;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import com.linklist.Linklist;

public class ComputeTree {
	

	Queue<Node> queue=new PriorityQueue<Node>();

	Node binaryTree(int[] input){
		Node node = new Node();
		node.data=input[(input.length/2)];
		//System.out.println(node.data);
		if((input.length/2)-1 >=0){
			node.left= binaryTree(Arrays.copyOfRange(input, 0, input.length/2));}
		if(((input.length/2)+1) <input.length){
			node.right= binaryTree(Arrays.copyOfRange(input,(input.length/2)+1,input.length));}
		return node;
		
	}
	
	Linklist createLinkList(Queue queue){
		Linklist ll= new Linklist();
		int i=1,data,k;
		
		while(!queue.isEmpty()){
			data=0;
			k=0;
			for(int j=0;j<i;j++){
				Node a= (Node) queue.peek();
				data=(data*10)+a.data;
				if(a.left!=null){
					queue.add(a.left);
					k++;
				}}
			i=k;
			ll.insert(data);
			
		}
		return ll;
	}
	
	public static void main(String[] args) {
int[] data= new int[11];
data[0]=0;
data[1]=1;
data[2]=2;
data[3]=3;
data[4]=4;
data[5]=5;
data[6]=6;
data[7]=7;
data[8]=8;
data[9]=9;
data[10]=10;
ComputeTree ct= new ComputeTree();
Node root= ct.binaryTree(data);
Queue qq=new PriorityQueue();
qq.add(root);
Linklist ll=ct.createLinkList(qq);
System.out.println(root);
//System.out.println(Arrays.copyOfRange(data, 0, data.length/2).length);






	}

}
