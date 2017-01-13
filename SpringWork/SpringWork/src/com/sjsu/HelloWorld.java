package com.sjsu;

import java.util.*;

public class HelloWorld {
	private String message;	
	private int num;
	private Answers a;
	
	public HelloWorld(Answers  a){
		this.a=a;
	}
	public HelloWorld(){
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Answers getA() {
		return a;
	}
	public void setA(Answers a) {
		this.a = a;
	}
	public void print(){
		System.out.println(num+"  "+message+"Answer No= "+a.ansNo+" Answer="+a.ans);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
