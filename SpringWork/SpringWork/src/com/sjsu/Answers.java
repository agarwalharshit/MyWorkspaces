package com.sjsu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Answers {
	public String ans;
	public int ansNo;
	public Answers(String ans,int ansNo){
		this.ans=ans;
		this.ansNo=ansNo;
	}
	
	public void print(){
		System.out.println(ans+" "+ansNo);
	}
	
	
	public static void main(String[] args) {
	}
	

}
