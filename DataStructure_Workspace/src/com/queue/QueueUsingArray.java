package com.queue;

import java.util.NoSuchElementException;

public class QueueUsingArray {

	int arr[] = new int[3];
	int head,tail;
	int flag=0;
	public QueueUsingArray(){
		head=tail=-1;
	}
	
	
	
	public void enqueue(int data){
		
		if(tail==-1){
			head++;tail++;
			arr[tail]=data;
		}else {
			if(checkOverflow()){
				throw new NoSuchElementException("Overflow");
			}else{
				tail=++tail%arr.length;
				arr[tail]=data;
			}
		}
		
		
	/*	
		if(tail==-1){
			head++;tail++;
			arr[tail]=data;
		}else if(tail<(arr.length-1)){
			tail++;
			arr[tail]=data;
		}else if(flag==0 && tail==(arr.length-1)){
			if(head>0){
				flag=1;
				tail=0;
				arr[tail]=data;
			}else{
				throw new NoSuchElementException("overflow");
			}
		}else if (flag==1){
			if(tail<(head-1)){
				arr[++tail]=data;
			}else{
				throw new NoSuchElementException("overflow");
			}	
		}*/
	}
	
	boolean checkOverflow(){
		return ((tail-head)==(arr.length-1))||((tail-head)==-1);
	}
	
	
public int dequeue(){
	
		if(underflow()){
			throw new NoSuchElementException("Under overflow");
		}else{
			if(tail==head){
				int data=arr[head];
			head=tail=-1;
				return data;
			}else{
				int data =arr[head];
				head = (++head%arr.length);
				return data;
			}
			
		}
	
	
	/*else if(flag == 0 && head<=tail){
		return arr[head++];
	}else if(flag==0 && head>tail){
		throw new NoSuchElementException("Under overflow");
	}else if(flag ==1 && head<(arr.length)){
		return arr[head++];
	}
	else if(flag ==1 && head>=arr.length){
		flag=0;head=0;
		return arr[head];
	}else{
		throw new NoSuchElementException("Under overflow");
	}*/
}
	
	boolean underflow(){
		return head==-1;
	}
	public boolean isEmpty(){
		return head==-1;
	}
	
	public static void main(String[] args) {
		QueueUsingArray queue= new QueueUsingArray();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.dequeue());
		queue.enqueue(40);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(40);
		queue.enqueue(40);
		System.out.println(queue.dequeue());

	}

}
