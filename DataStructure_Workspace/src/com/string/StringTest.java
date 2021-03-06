package com.string;

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringTest {

	public static void main(String[] args) {

		int[] arr={-5,-3,-1,6,2,7,3,4,4,-4,-8,10};
		Arrays.sort(arr);
		for(int i:arr)
		System.out.println(i);
		if(null==arr)
			return;
		
	if(arr[0]>0)
		return;
	int i=0;
	int j=arr.length-1;
	while(i<j && arr[i]<=0){
		if(arr[i]+arr[j]==0){
			System.out.println(""+arr[i]+" "+arr[j]);
			if(arr[j]==arr[j-1]){
				j=j-1;
			}else {
				i=i+1;
			}
			
		}else if(arr[i]+arr[j]>0){
			j=j-1;
		}else{
			i=i+1;
		}
	}
		
	}
	
	
	
	int calculatePosition(char c){
		return (int)c-97;
	}
	
	String compress(String s){
		StringBuilder sb = new StringBuilder();
		char c='\u0000';
		int count=0;
		for(int i=0;i<s.length();i++){
		if(c==s.charAt(i)){
			count++;
		}else{
			c=s.charAt(i);
			if(count>0){
				sb.append(count);
			}
			sb.append(s.charAt(i));
			count=1;	
		}
		}
		if(count>0){
			sb.append(count);
		}
		
		
		return sb.toString();
	}
	
	
int match(String s1, String s2){
	if(s1.length()!=s2.length()){
		return 0;
	}
	int index=0;
	int position=-1;
for(int i=0;i<s1.length();i++){
	if(s2.charAt(index)==s1.charAt(i)){
		if(position==-1){
			position=i;
		}
		index++;
	}else{
		position=-1;
	}
}
if(position>-1){
	s2=s2.substring(index, s2.length())+s2.substring(0, index);
}
System.out.println(s2);
if(s1.equals(s2)){
	return 1;
}else{
	return 0;
}
}
	



int anagram(String s1){
	int counter=0;
	if(s1==null || s1.length()==1){
		return 1;
	}
	int[] ch= new int[128];
	for(int i =0;i<s1.length();i++){
		if(ch[s1.charAt(i)]%2==0){
			counter++;
			ch[s1.charAt(i)]=ch[s1.charAt(i)]+1;
		}else{
			counter--;
			ch[s1.charAt(i)]=ch[s1.charAt(i)]+1;
		}
	}
	if(counter==1){
		return 1;
	}
	return 0;	
	}
	}	

