package com.queue;

import java.util.PriorityQueue;

import com.stack.Stack;

public class QueueUsingStack{
	Stack s1;
	Stack s2;
	boolean s1Enabled=true;
	public QueueUsingStack(){
		s1= new Stack();
		s2= new Stack();
	}
	public void enqueue(char data){
		if(s1Enabled){
			s1.push(data);
			System.out.println("Inserted No Swap");
		}else{
			s1Enabled=true;
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
			s1.push(data);
			System.out.println("Inserted With Swap");
		}
	}
	
	public char dequeue(){
		if(s1Enabled){
			s1Enabled=false;
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			System.out.println("Deleted with Swap");
			return s2.pop();
		}else{
			System.out.println("Deleted No Swap");
			return s2.pop();
		}
	}
	

	public static void main(String[] args) {
		QueueUsingStack qs = new QueueUsingStack();
		qs.enqueue('1');
		qs.enqueue('2');
		qs.enqueue('3');
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		qs.enqueue('4');
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());

	}
	
	
	
	
	static int segment(int x, int[] arr) {
        int size = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue(size);
        PriorityQueue<Integer> maxHeap = new PriorityQueue(size);
        for(int i=0; i<x -1; i++){
            minHeap.add(arr[i]);
        }
        
        for(int i=x -1; i<size;i++){
            minHeap.add(arr[i]);
            int windowMin = minHeap.remove();
            maxHeap.add(windowMin);
            minHeap.add(windowMin);
            int index = i-x+1;
            minHeap.remove(arr[index]);
        }
        
        int result = maxHeap.remove();
        return result;
    }
	
	
	
	

}
