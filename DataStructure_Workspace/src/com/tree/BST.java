package com.tree;

import java.util.Stack;

public class BST {
	Node root;
	BST(){
		root=null;
	}
	
	void insert(int data){
		if(root==null){
			root=new Node(data);
		}else{
			Node child=root;
			Node parent=root;
			while(true){
				parent=child;
			if(data>parent.data){
				child=parent.right;
				if(child==null)
				{parent.right=new Node(data);
				return;
				}
			}else{
				parent.lcount+=1;
				child=parent.left;
				if(child==null)
				{parent.left=new Node(data);
				return;
				}
			}
			
			}
			
		}
	}
	
	
	public boolean searchNode(Node n){
		boolean found=false;
		if(root==null){
			
		}else{
			Node child=root;
			while(child!=null)
			{
			if(n.data==child.data){
				found=true;
				break;
			}else if(n.data>child.data){
				child=child.right;
			}else{
				child=child.left;
			}
			}
		}
		return found;
		
	}
	
	void inorderWithRecurssion(Node root){
		if(root !=null){
			
			inorderWithRecurssion(root.left);
			System.out.print(root.data);
			inorderWithRecurssion(root.right);
		}
		System.out.println();
		
	}
	void preorderWithoutRecurssion(Node root){
		Node child;
			if(root==null){
				return;
			}
			Stack<Node> s1= new Stack();
			s1.push(root);
			
			while (!s1.isEmpty()){
				child=s1.pop();
				System.out.println((child.data));
				if(child.right!=null){
					s1.push(child.right);
				}
				if(child.left!=null){
					s1.push(child.left);
				}	
			}
		}
	void preprderWithRecurssion(Node root){
		if(root !=null){
			System.out.print(root.data);
			inorderWithRecurssion(root.left);
			inorderWithRecurssion(root.right);
			System.out.println();	
		}
		
	}
	void inorderWithoutRecurssion(Node root, int count){
		Node child=root;
		int counter=0;
		if(root ==null){
			return;
		}
			
			Stack<Node> s1= new Stack();
			while(child!=null){
				s1.push(child);
				child=child.left;
			}
			while(!s1.isEmpty()){
				child=s1.pop();
				counter++;
				if(counter==count){
					System.out.println(child.data);
					return;
				}
				if(child.right!=null){
					child=child.right;
					s1.push(child);
					while(child.left!=null){
						child=child.left;
						s1.push(child);
					}
				}
				
			}
		
		
		
	}
	void postorderWithRecurssion(Node root){
		if(root !=null){

			inorderWithRecurssion(root.left);
			inorderWithRecurssion(root.right);
			System.out.print(root.data);
		}
		System.out.println();
		
	}
	void postorderWithoutRecurssion(Node root){
		Node child=root;
		if(root ==null){
			return;
		}
			Stack<Node> s1= new Stack();
			Stack<Node> s2= new Stack();
			s1.push(root);

			while(!s1.isEmpty()){
				child=s1.pop();
				s2.push(child);
				if(child.left!=null)
					s1.push(child.left);
				if(child.right!=null)
					s1.push(child.right);
			}
			
			while(!s2.isEmpty())
				System.out.println(s2.pop().data);
			
	}
	void getNthNodewithLCount(Node root, int count){
		Node current=root;
		
		if(root==null){
			System.out.println("Empty list");
			return;
		}
		while(current!=null){
		if(current.lcount+1==count){
			System.out.println(current.data);
			return;
		}else if(count>current.lcount+1){
			count=count-(current.lcount+1);
			current=current.right;
		}else{
			current=current.left;
		}
		}
	}
	
	

	public static void main(String[] args) {

		BST bst= new BST();
		bst.insert(5);
		bst.insert(7);
		bst.insert(3);
		bst.insert(1);
		bst.insert(4);
		bst.insert(6);
		bst.insert(8);
		//System.out.println("hiiii"+bst.searchNode(new Node(1)));
		//bst.inorderWithoutRecurssion(bst.root,3);
		bst.getNthNodewithLCount(bst.root,4);
		//bst.inorderWithRecurssion(bst.root);
		//bst.preprderWithRecurssion(bst.root);
		//bst.postorderWithRecurssion(bst.root);
	}

}
