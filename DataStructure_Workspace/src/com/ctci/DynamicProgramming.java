package com.ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

public class DynamicProgramming {
	public class Point{
		int row;
		int column;
		
		 Point(int row, int column){
			 this.row=row;
			 this.column=column;
		 }
		
		public int getRow() {
			return row;
		}
		public void setRow(int row) {
			this.row = row;
		}
		public int getColumn() {
			return column;
		}
		public void setColumn(int column) {
			this.column = column;
		}
		@Override
		public int hashCode(){
			return (row*2)+row+column;
		}
		public boolean equals(Point p){
		if(this.row==p.row && this.column==p.column){
			return true;
		}
		return false;
		}
		
	}
	
	int[] arr;
	public static void main(String[] args) {
	// For Question 1
		DynamicProgramming dp = new DynamicProgramming();
		 boolean[][] blocked = new boolean[5][5];
		 blocked[2][0]=true;
		 blocked[0][2]=true;
		 blocked[3][2]=true;

//		int[] a={8,5,5,4,3,4,5,3,5,6};
//		a=dp.mergesort(a, 0, a.length-1);
//		for(int aa:a){
//			System.out.println(aa);
//		}
		 
		 
		 
		 
		 
		 //Question3: magic number
//		 ArrayList<Point> path=dp.robotInAGridQ2(blocked);
//		 
//		 for(Point p:path){
//			 System.out.println(p.row+" "+p.column);
//		 }
		 
		 int[] arr={-3,0,1,4,5,6,7,8,9};
		 
		// int i=dp.magicNumberQ3(arr,0,arr.length-1);
		 //System.out.println(i);
	
	}
	
	
	int magicNumberQ3(int[] arr, int start, int end){
		if(end<start){
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]==mid){
			return mid;
		}
		int output;
		if(arr[mid]<mid){
			output=magicNumberQ3(arr,start,arr[mid]);
			
		}else{
			output= magicNumberQ3(arr,start,mid-1);	
		}
		if(output>-1){
			return output;
		}
		
		if(arr[mid]>mid){
			output= magicNumberQ3(arr,arr[mid], end);	
		}else{
			output= magicNumberQ3(arr,mid+1,end);	
		}
		if(output>-1){
			return output;
		}
		
		
		
	return -1;
	}
	
	
	
	
	ArrayList<Point> robotInAGridQ2(boolean[][] blocked){
		
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> traversed= new HashSet<Point>();
		path=robotInAGridQ2(blocked, blocked.length-1, blocked[0].length-1,path,traversed);
		return path;
	}
	
	ArrayList<Point> robotInAGridQ2(boolean[][] blocked,int row,int column, ArrayList<Point> path,HashSet<Point> traversed){
		Point point = new Point(row,column);
		if(row<0||column<0||blocked[row][column] ||traversed.contains(point)){
			return null;
		}
		if(traversed.contains(point)){
			return null;
		}
		
		if((row==0 && column==0) ||(null!=robotInAGridQ2(blocked,row-1,column,path,traversed)) || (null!=robotInAGridQ2(blocked,row,column-1,path,traversed))){
			path.add(point);
			traversed.add(point);
			return path;
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	int[] mergesort(int[] arr, int l, int r){
		
		int mid=(l+r)/2;
		if(l<r){
//	
		mergesort(arr, l, mid);
		mergesort(arr, mid+1, r);
		merge(arr,l,mid,r);
		}
		return arr;
	}
	int[] merge(int[] arr, int l, int mid, int r){
		
		int n1=mid-l+1; 
		int n2=r-mid;
		int[] arr1= new int[n1];
		int[] arr2= new int[n2];
		
		for(int i=0;i<=(mid-l);i++){
			arr1[i]=arr[l+i];
		}
		for(int i=0;i<(r-mid);i++){
			arr2[i]=arr[mid+i+1];
		}
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				arr[l]=arr1[i];
				i++;
				l++;
			}else{
				arr[l]=arr2[j];
				j++;
				l++;
			}
		}
		if(i<arr1.length){
			while(i<arr1.length){
				arr[l]=arr1[i];
				i++;
				l++;
			}
		}
		if(j<arr2.length){
			while(j<arr2.length){
				arr[l]=arr2[j];
				j++;
				l++;
			}
		}
		
		return arr;
	}
	
	int findPathsOfRestrictedSquare(int[][] arr, int row, int column){
		if(!isPathCorrect(arr, row, column)){
			return 0;
		}if((row+1==arr.length-1 && column==arr[1].length-1)||(row==arr.length-1 && column+1==arr[1].length-1)){
		return 1;	
		}
		if(arr[row][column]>-1){
			return arr[row][column];
		}
		
		arr[row][column]=findPathsOfRestrictedSquare(arr, row+1,column)+findPathsOfRestrictedSquare(arr, row,column+1);
		return arr[row][column];
			
	}
	boolean isPathCorrect(int[][] arr, int row, int column){
		if(row>=arr.length || column>=arr[1].length || arr[row][column]==-2){
			return false;
		}else{
			return true;
		}
	}
	
	int Q1TripleStepsSecondApproach(int count, int steps){

		if(count>steps){
			return 0;
		}else if(steps==count){
			return 1;
		}else if(arr[count]>0){
			return 1+arr[count];
		}
		int x= Q1TripleStepsSecondApproach(count+1,steps)+Q1TripleStepsSecondApproach(count+2,steps)+Q1TripleStepsSecondApproach(count+3,steps);
		arr[count]=x;
		if(count==0){
			return arr[0];
		}else{
			return Q1TripleStepsSecondApproach(count-1,steps);
		}
		
		
	}
	
	int craken(int r, int c,HashMap<String,Integer> hm){
		if(r<1 || c<1){
			return 0;
		}
		if(r==1 && c==1){
			return 1;
		}
		int noOfPaths=0;
		String left=r+""+(c-1);
		String top=(r-1)+""+c;
		String diagonal=(r-1)+""+(c-1);
		if(hm.containsKey(left)){
			noOfPaths=noOfPaths+hm.get(left);
		}else{
			noOfPaths=noOfPaths+craken(r,c-1,hm);
		}
		
		if(hm.containsKey(top)){
			noOfPaths=noOfPaths+hm.get(top);
		}else{
			noOfPaths=noOfPaths+craken(r-1,c,hm);
		}
		if(hm.containsKey(diagonal)){
			noOfPaths=noOfPaths+hm.get(diagonal);
		}else{
			noOfPaths=noOfPaths+craken(r-1,c-1,hm);
		}
		return noOfPaths;
		
	}
		
//		System.out.println("R="+r+" C="+c);
//		if(r==(arr.length-1) && c==(arr[0].length)-1){
//			return true;
//		}else{
//			if(r<((arr.length)-1) && !paths.containsKey(((r+1)+""+c)) && arr[r+1][c]>-1){
//				String key=r+1+""+c;
//				String value=paths.get(r+""+c)+","+key;
//				System.out.println("Key="+key+" Value="+value);
//				paths.put(key, value);
//				boolean res=robotMoveQ2(arr, r+1, c, paths);
//				if(res){
//					return true;
//				}
//			}
//
//			if(c<((arr[0].length)-1) && !paths.containsKey((r+""+(c+1)))&& arr[r][c+1]>-1){
//				String key=r+""+(c+1);
//				String value=paths.get(r+""+c)+","+key;
//				System.out.println("Key="+key+" Value="+value);
//				paths.put(key, value);
//				boolean res=robotMoveQ2(arr, r, c+1, paths);
//				if(res){
//					return true;
//				}
//			}
//		}
//		return false;
	//}
	
	
	
	boolean robotMoveQ2(int[][] arr, int r, int c, HashMap paths){
		System.out.println("R="+r+" C="+c);
		if(r==(arr.length-1) && c==(arr[0].length)-1){
			return true;
		}else{
			if(r<((arr.length)-1) && !paths.containsKey(((r+1)+""+c)) && arr[r+1][c]>-1){
				String key=r+1+""+c;
				String value=paths.get(r+""+c)+","+key;
				System.out.println("Key="+key+" Value="+value);
				paths.put(key, value);
				boolean res=robotMoveQ2(arr, r+1, c, paths);
				if(res){
					return true;
				}
			}

			if(c<((arr[0].length)-1) && !paths.containsKey((r+""+(c+1)))&& arr[r][c+1]>-1){
				String key=r+""+(c+1);
				String value=paths.get(r+""+c)+","+key;
				System.out.println("Key="+key+" Value="+value);
				paths.put(key, value);
				boolean res=robotMoveQ2(arr, r, c+1, paths);
				if(res){
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	int tripleStepsQ81(int n, int[] a){

		if(n==0){
			a[n]=0;
			return 1;
		}
		
		if(a[n]==0){
			if(n==1){
				a[n]= tripleStepsQ81(n-1, a);
			}else if(n==2){
				a[n]=tripleStepsQ81(n-1,a)+tripleStepsQ81(n-2,a);
			}else{
			a[n]= tripleStepsQ81(n-1, a)+tripleStepsQ81(n-2,a)+tripleStepsQ81(n-3,a);
			}
		}
		return a[n];
		
		
		
	}
	

}
