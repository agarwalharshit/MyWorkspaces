package com.tree;

import com.stack.StackForInt;

public class TreeProg {

	public static void main(String[] args) {
		Node n5 = new Node(5); 
		Node n3= new Node(3); 
		Node n8 = new Node(8); 
		Node n1 = new Node(1); 
		Node n4 = new Node(4); 
		Node n7 = new Node(7); 
		Node n10 = new Node(10); 
		n5.left=n3;
		n5.right=n8;
		n3.left=n1;
		n3.right=n4;
		n8.left=n7;
		n8.right=n10;
		TreeProg t= new TreeProg();
		t.inOrderTraversal(n5);

	}
	
	
	
void inOrderTraversal(Node root){
	Node n=root;
	Node n1;
	StackForInt stack = new StackForInt();
	while(n!=null){
		stack.push(n);
		n=n.left;
	}
	while(!stack.isEmpty()){
		n1=stack.pop();
		System.out.println(n1.data);
		if(n1.right!=null){
			n1=n1.right; 
			stack.push(n1);
			while(n1.left!=null){
				n1=n1.left;
				stack.push(n1);
			}
		}
	}
}

}
