package com.ctci;

public class TwitterPandey {

	public static void main(String[] args) {
		String message="Li, ailu jw au facntll-Zrws Jrpfqf Bpijf";
		String pattern="Your Friend Alice";
		TwitterPandey tp = new TwitterPandey();
		String key=tp.findKey(message, pattern);
		int[] karr= new int[key.length()];
		for(int i=0;i<key.length();i++){
			karr[i]=(int)(key.charAt(i)-'0');
		}
		System.out.println(karr);
		tp.decrypt(message, karr);
	}
	
public void decrypt(String a,int[] a1){
		
		//int a1 []={4,0,7,1,3,2,1};
		//int a1 []={2,5,1,2,2,0,8};
		
		int k=0;
		for(int i=0;i<a.length();i++)
		{
			int c=a.charAt(i);
			if(c>=65 && c<=90)
			{
				
				c=c-a1[k];
				k++;
				if(c<65)
				{
					c=90-(65-c-1);
				}
				char d=(char)c;
				System.out.print(d);
				
			}
			else if(c>=97 && c<=122)
			{
				
				c=c-a1[k];
				k++;
				if(c<97)
				{
					c=122-(97-c-1);
				}
				char d=(char)c;
				System.out.print(d);
				
			}
			else
			{
			System.out.print((char)c);
			}
			if(k==a1.length)
			{
				k=0;
			}
				
			
		}
		
		
		
		
	}
//	public void decrypt(String message, String key){
//		StringBuilder cypherText= new StringBuilder();
//		int j=0;
//		for(int i=0;i<message.length();i++){
//			if(((message.charAt(i)-'a')>=0 && (message.charAt(i)-'a')<26) || ((message.charAt(i)-'A')>=0 && (message.charAt(i)-'A')<26)){
//			int keyi=key.charAt(j)-'0';
//			int c=(((int)message.charAt(i))-keyi);
//			int c1=message.charAt(i);
//			if(c<(int)'A' ||(c<(int)'a' && c>(int)'Z')){
//				c=(char) (c+26);
//			}
//			cypherText.append(c);
//				j++;
//				j=j%key.length();
//			}else{
//				cypherText.append(message.charAt(i));
//			
//			}
//				
//		}
//		System.out.println(cypherText);
//		
//	}
		
		public String findKey(String message, String pattern){
		String[] splitArr= message.split("-");
		String message1="";
		String signatureEncr=splitArr[splitArr.length-1];
		for(int i=0;i<splitArr.length-1;i++){
			message1=message1+splitArr[i];
		}
		StringBuilder sbl= new StringBuilder();
		int count=0;
		for(int i=0;i<message1.length();i++){
			if(((message1.charAt(i)-'a')>=0 && (message1.charAt(i)-'a')<26) || ((message1.charAt(i)-'A')>=0 && (message1.charAt(i)-'A')<26)){
			sbl.append(message1.charAt(i));
			count++;
			}
		}
		int i=0;
		int j=0;
		StringBuilder key=new StringBuilder();
		//System.out.println(signatureEncr+" "+pattern);
		
		while(i<signatureEncr.length() && j<pattern.length()){
			if(!((signatureEncr.charAt(i)-'a'>=0 && signatureEncr.charAt(i)-'a'<26)||(signatureEncr.charAt(i)-'A'>=0 && signatureEncr.charAt(i)-'A'<26))){
				i++;
			}else if(!((pattern.charAt(j)-'a'>=0 && pattern.charAt(j)-'a'<26)||(pattern.charAt(j)-'A'>=0 && pattern.charAt(j)-'A'<26))){
				j++;
			}else{
				//System.out.println(pattern.charAt(j)+" "+signatureEncr.charAt(i));
				int key1=signatureEncr.charAt(i)-pattern.charAt(j);
				System.out.println(key1);
				key.append(key1);
				i++;
				j++;
			}
		}
		
		
	//System.out.println(key);
	int patternLength=0;
	int j1=0;
	
	for(int i1=1;i1<key.length();i1++){
		if(key.charAt(i1)!=key.charAt(j1)){
			patternLength++;
		}else{
			j1++;
		}
	}
	patternLength++;
	int extra=0;
	if(patternLength!=0)
	extra= sbl.length()%patternLength;
	String key1=key.toString().substring(0,patternLength);
//	System.out.println(key1);
	key1=key1.substring(patternLength-extra)+key1.substring(0,patternLength-extra);
	//System.out.println(key1);
	return key1;
	
		
	}
}
