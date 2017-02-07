package com.linklist;

public class MergeTwoSortedList {
	Linklist l1;
	Linklist l2;	
	Node head1;
	Node head2;
	MergeTwoSortedList(){
		l1= new Linklist();
		l2= new Linklist();
	}

/*	Node merge(Linklist l1,Linklist l2){
		head1=l1.head;
		Node a=l1.head;
		head2=l2.head;
		Node b= l2.head;
		if (a==null){
			head1=head2;
			return head1;
		}else if(b==null){
			return head1;
		}else{
			while(a.next!=null && b.next!=null){
				if(a==head1){
					if(a.data>b.data){
						head2=b.next;
						b.next=head1;
						head1=b;
						b=head2;
						a=head1;
						
					}
				}
				if(a.next==null){
					a.next=b;
					head2=null;
					b=null;
					
				}else if(b.next==null){
					a=a.next;
				}else{
					if(b.data<a.data){
						head2=b.next;
						b.next=a.next;
						a.next=b;
						b=head2;
					}else{
						a=a.next;
					}
				}
			}
		}
	
} */

void compute(){

	//merge(l1,l2);
}
	public static void main(String[] args) {

	}

}
