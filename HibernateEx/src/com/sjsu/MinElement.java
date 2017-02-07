package com.sjsu;

public class MinElement {

	public static void main(String[] args) {
		try{
		//int[] arr={56,78,89,4,12,23,34,44};
		int[] arr={8,1,2,3,4,5,6,7};
		int minElement=-1;
		
		for(int i=0;i<(arr.length-1);i++){
			if(arr[i+1]<arr[i]){
				minElement=arr[i+1];
				break;
			}
		}
		if(minElement==-1){
			minElement=arr[0];
		}
		System.out.println(minElement);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
