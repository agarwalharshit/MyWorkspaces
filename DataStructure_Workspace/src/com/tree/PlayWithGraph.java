package com.tree;

import java.util.ArrayList;

public class PlayWithGraph {
	Boolean Result=false;
	ArrayList<Graph> node;
	
	boolean DFS(Graph start, Graph searchElement){
		start.isTraversed=true;
		System.out.println(start.data);
		if(start.data==searchElement.data){
			
			return true;
		}
		if(start.childs!=null){
			node=start.childs;
			for(Graph n : node){
				if(!n.isTraversed){
				Result=DFS(n, searchElement);
				if(Result)
					break;
				}
			
		}}
		return Result;
		
	}
	
	public Node formTree(int[] a, int start,int end){
		Node n= null;
		if(end<start)
			return null;
		n = new Node(a[(end+start)/2]);
		n.left=formTree(a,start,((end+start)/2)-1);
		n.right=formTree(a,((end+start)/2)+1,end);
		
		return n;
	}
	
	
	boolean BST(Node parent,int start,int end){
		boolean result=true;
		if(parent==null)
			return true;
		if(parent.data< start || parent.data>end){
			return false;
		}
		if(!BST(parent.left,start,parent.data))
			return false;
		
		if(!BST(parent.right,parent.data,end))
				return false;
		
		
		return result;
		
	}
	
	public void  preorderWithoutStack(Node n){
		Node root=n;
		Node child=null;
		while(n!=null){
		if(n.left!=null){
			child=n.left;
			while(child.right!=null && child.right!=n){
				child=child.right;
			}
			if (child.right==null){
				child.right=n;
				System.out.println(n.data+" ");
				n=n.left;
			}else{
				//System.out.println(n.data+" ");
				n=n.right;	
				}
			
		}else{
			System.out.println(n.data+" ");
			n=n.right;
		 }	
	}
}
	
	

	public static void main(String[] args) {
		Node N = new Node(7);
		Node N5 = new Node(5);
		Node N2 = new Node(2);
		Node N6 = new Node(6);
		Node N10 = new Node(10);
		Node N8 = new Node(8);
		Node N12 = new Node(12);
		N.left=N5;
		N.right=N10;
		N5.left=N2;
		N5.right=N6;
		N10.left=N8;
		N10.right=N12;
		PlayWithGraph PWG= new PlayWithGraph();
		PWG.preorderWithoutStack(N);

		
		
		
	
		
		
	}

}
