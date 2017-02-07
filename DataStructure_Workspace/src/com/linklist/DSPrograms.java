package com.linklist;

import java.util.Hashtable;

public class DSPrograms {

void duplicate(Linklist ll){
	Node head, a, b, c=null;
	head=ll.head;
	a=head;
	ll.print();
	while(a.next()!=null){
		b=a;
		c=a.next();
		while(c!=null){
			if(c.data()==a.data()){
				b.next=c.next;
				c.next=null;
				c=b.next;
			}else{
				b=c;
				c=c.next;
			}
			
		}
		a=a.next;
	}
	System.out.println("Hii");
	ll.print();
	
}


void duplicateusingHashtable(Linklist ll){
	Node head, a=null, b=null;
	head=ll.head;
	b=head;
	Hashtable ht= new Hashtable();
	
	ll.print();
	while(b !=null && b.next()!=null){
		if(ht.containsKey(b.data)){
			a.next=b.next;
			b.next=null;
			b=a.next;
		}else{
			ht.put(b.data, 1);
			if(a==null){
				a=head;
				b=b.next;
			}else{
				a=a.next;
				b=b.next;
			}
		}
	}
	System.out.println("Hii");
	ll.print();
	
}

	
void kthnumber(Linklist ll,int k){
	Node head, leading, trailing =null;
	head=ll.head;
	leading=head;
	trailing=head;
	ll.print();
	if(head==null){
		System.out.println("Empty list");
		return;
	}
	for (int i=0;i<k;i++){
		if(leading==null){
			System.out.println("ll less then K");
			return;
		}else{
			leading=leading.next;
		}
	}
	while(leading!=null && leading.next!=null)
	{
		trailing=trailing.next;
		leading=leading.next;
	}
	System.out.println("Output is "+trailing.data);
	
}

void partition(Linklist ll,int mid){
	Node head, pPoint=null, traverse=null;
	head=ll.head;
	pPoint=head;
	traverse=head.next;
	ll.print();
	while(traverse!=null){
		if(traverse.data<mid){
			if(pPoint.data>=mid){
				pPoint.data=pPoint.data+traverse.data;
				traverse.data=pPoint.data-traverse.data;
				pPoint.data=pPoint.data-traverse.data;
				traverse=traverse.next;
			}else{
				pPoint=pPoint.next;
				pPoint.data=pPoint.data+traverse.data;
				traverse.data=pPoint.data-traverse.data;
				pPoint.data=pPoint.data-traverse.data;
				traverse=traverse.next;
			}
		}else{
			traverse=traverse.next;
		}
	}
	
	ll.print();
	
}

int add2Numbers(Node ll1,Node ll2){
if(ll1==null && ll2==null){
	return 0;
}
int carry= add2Numbers(ll1.next,ll2.next);
int sum=ll1.data+ll2.data+carry;
ll1.data=sum%10;
return sum/10;

}


Return1 isPallendrome(Node i, Node j){
	Return1 r1= new Return1();
	if(i==null){
		r1.n1=j;
		return r1;
	}
	r1=isPallendrome(i.next,j);
	if(r1.isNotPallendrome)
		return r1;
	if(r1.n1.data==i.data){
		r1.n1=r1.n1.next;
		return r1;
	}else{
		r1.isNotPallendrome=true;
		return r1;
	}
	
}


	public static void main(String[] args) {
		Linklist ll= new Linklist();
//		ll.insert(6);
//		ll.insert(2);
//		ll.insert(1);
//		ll.insert(1);
//		ll.insert(2);
//		ll.insert(6);
//		ll.insert(5);
//		ll.insert(3);
//		ll.insert(9);
//		ll.insert(2);
//		ll.insert(11);
		DSPrograms dsprogram= new DSPrograms();
		Return1 r1=dsprogram.isPallendrome(ll.head,ll.head);
		if(r1!=null && !r1.isNotPallendrome){
			System.out.println("pallendrome");
		}
		
	}

}
