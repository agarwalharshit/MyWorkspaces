package com.programs;
import java.util.*;

public class BitChap5 {

	public static void main(String[] args) {
////		int n=(int)Math.pow(2,10);
////		int m=19;
////		int j=6;
////		int i=2;
//		BitChap5 b = new BitChap5();
//		System.out.println(b.binaryToStringQ2(.72));
////		int a=~0;
////		System.out.println(Integer.toBinaryString(a));
////		System.out.println(Integer.toBinaryString(a << 7));
		
		
//		HashMap hm = new HashMap();
//		hm.put(1, 5);
//		//hm.put(1, 6);
//		hm.put(2, 5);
//		System.out.println(hm.get(1));p;0                
//		System.out.println(hm.get(2));
		
		int a=-75;
//		10110101
//		 1001011
		
		System.out.println((-75)>>>=1);
		
		
		
		
	}

	
	
	
	
	String binaryToStringQ2(double n){
		StringBuilder bin=new StringBuilder();
	for(int i=0;i<32;i++){
		n=n*2;
		if(n>=1.0){
			bin.append("1");
			n=n-1.0;
		}else{
			bin.append("0");
		}
		if(n==0.0){
			return bin.toString();
		}
	}
		return "error";
	}
	
	
	void insertionQ1(int n, int m, int i, int j){
		int a=~0;
		a=a<< (j+1);
		System.out.println(Integer.toBinaryString(n));
		a=a | ((1<<i)-1);
		System.out.println(Integer.toBinaryString(n & a));
		n=n & a;
		n=n|(m<<i);
		System.out.println(Integer.toBinaryString(n));
	}
	
	
	
}
