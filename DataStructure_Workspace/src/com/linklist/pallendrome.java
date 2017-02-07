package com.linklist;

public class pallendrome {
	Linklist l1;
	pallendrome(){
		l1= new Linklist();
	}

void compute(){

	Node mid=l1.head;
	Node last=l1.head.next;
	Node c=null;
	Node d=null;
	Node e=null;
	while(last!=null && last.next!=null && last.next.next!=null){
		mid=mid.next;
		last=last.next.next;
	}
	if(last!=null && last.next!=null){
		last=last.next;
		c=mid.next.next;
		
	}else{
		c=mid.next;
	}
		mid.next=last;
		d=c.next;
		e=d.next;
		c.next=null;
		
		
	
	while(d!=null){
		d.next=c;
		c=d;
		d=e;
		if(e!=null)
			e=e.next;
	}
	//mid.next=last;
	System.out.println(l1);
	mid=mid.next;
	boolean flag=true;
	while(mid!=null){
		if(l1.head.data!=mid.data){
			System.out.println("Not A pallendrome");
			flag = false;
			break;
		}
		l1.head=l1.head.next;
		mid=mid.next;
	}
if(flag)
	System.out.println("pallendrome");
	
}

void ZigZag(){

	Node a,b,c;
	if(l1.head!=null && l1.head.next!=null && l1.head.next.next!=null){
		a=l1.head;b=a.next;c=b.next;
		
		while(c.next!=null){
			a.next=c;
			b.next=c.next;
			c.next=b;
			
			a=c;
			c=b.next;

		}
	}
	
	while(l1.head!=null){
		System.out.println(l1.head.data);
		l1.head=l1.head.next;
	}

	
}



void ZigZagApproach2(){

	Node a;
	a=l1.head.next;
	
	while(a!=null && a.next!=null && a.next.next!=null){
		a.data=a.data+a.next.data;
		a.next.data=a.data-a.next.data;
		a.data=a.data-a.next.data;
		//int b=a.data;
		//a.data=a.next.data;
		//a.next.data=b;
		a=a.next;
	}
	
	while(l1.head!=null){
		System.out.println(l1.head.data);
		l1.head=l1.head.next;
	}

	
}


void EvenOdd(){


	Node a,b,c;
	if(l1.head!=null && l1.head.next!=null && l1.head.next !=null){
		a=l1.head;
		b=c=l1.head.next;
		
		while ((a.next!=null && a.next.next!=null) || (b.next!=null && b.next.next!=null))
		{
			if(a.next!=null && a.next.next!=null){
				a.next=a.next.next;
				a=a.next;
			}else if(a.next!=null && a.next.next==null){
				a.next=null;
			}
			if(b.next!=null && b.next.next!=null){
				b.next=b.next.next;
				b=b.next;
			}else if(b.next!=null && b.next.next==null){
				b.next=null;
			}
		}
		a.next=c;
	}
	
	
	while(l1.head!=null){
		System.out.println(l1.head.data);
		l1.head=l1.head.next;
	}

	
}





	public static void main(String[] args) {
		pallendrome p= new pallendrome();
		p.EvenOdd();

	}

}
