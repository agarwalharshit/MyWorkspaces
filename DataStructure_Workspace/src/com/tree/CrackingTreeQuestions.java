package com.tree;
import java.util.*;

public class CrackingTreeQuestions {

	LinkedList[] arr= new LinkedList[10];
	public static void main(String[] args) {
		
		Node n1= new Node(10);
		Node n2= new Node(5);
		Node n3= new Node(3);
		Node n4= new Node(8);
		Node n5= new Node(7);
		Node n6= new Node(6);
		Node n7= new Node(9);
		Node n8= new Node(20);
		Node n9= new Node(15);
		Node n10= new Node(25);
		n1.left=n2;
		n2.left=n3;
		n2.right=n4;
		n4.left=n5;
		n4.right=n7;
		n5.left=n6;
		n1.right=n8;
		n8.left=n9;
		n8.right=n10;
		
		CrackingTreeQuestions p = new CrackingTreeQuestions();
		boolean n=p.checkSubTreeQ10(n1,n8,false,n8);
		System.out.println(n);


		}
	
	
	
	
	
	boolean checkSubTreeQ10(Node n, Node sub, boolean isMatched, Node findMatched){
		boolean a=false,b=false;
		
		if(findMatched!=null && n.data==findMatched.data){
			isMatched=true;
			
			if(n.left!=null){
			a=	checkSubTreeQ10(n.left, sub, isMatched, findMatched.left);
			}
			if(n.right!=null){
			b=	checkSubTreeQ10(n.right, sub, isMatched, findMatched.right);
			}
			
			if(a && b){
				return true;
			}else{
				return false;
			}
			
		}else if(isMatched){
			isMatched=false;
			return checkSubTreeQ10(n, sub, isMatched, sub);
		}else{
		if(n.left!=null){
			a=checkSubTreeQ10(n.left, sub, isMatched, findMatched);
		}
		if(n.right!=null){
			b=checkSubTreeQ10(n.right, sub, isMatched, findMatched);
		}
		
		if(a ||b ){
			return true;
		}else{
			return false;
		}
		}
	}
	
	
	
	
	
	Node buildfirstCommonAncestorQ8(Node n,Node na,Node nb){
		Stack<Node> s = new Stack<Node>();
		//boolean found=false;
		Node common=null;
		
		while(n!=null){
			s.push(n);
			n=n.left;
			
		}
		while(!s.isEmpty()){
			Node nn=s.peek();
			if((nn.left==null && nn.right==null)||(nn.right!=null && nn.right==n)||(nn.right==null && nn.left==n)){
			//System.out.println(nn.data);
				if(na==nn && nb==nn){
					return nn;
				}else if(common!=null && (na==nn ||nb==nn)) {
					return common;
				}else if(na==nn ||nb==nn) {
					common=nn;
				}else if((nn.left!=null && nn.left==common) ||(nn.right!=null && nn.right==common)) {
					common=nn;
				}
			n=s.pop();
			}else if(nn.right!=null){
				if((nn.left!=null && nn.left==common)) {
					common=nn;
				}
				nn=nn.right;
				s.push(nn);
				while(nn.left!=null){
					s.push(nn.left);
					nn=nn.left;
				}			
			}
		}
		return common;
	}
	
	
	
	
	
	
}

















