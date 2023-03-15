package com.bridgesoft;

public class Demo {

	public static void main(String[] args) {

		System.out.println(10+15.25f+"A"+"B");
		
//		for(int i=0;false;i++) {
//			System.out.println("Hello");
//		}
//		 
//			System.out.println("World");
//		========================================
//		int arr[] ;
//		for(int i=0;i<10;++i) {
//			arr[i]=i;
//			i++;
//			
//			
//		}
//		
//		System.out.println(arr[]+" ");
		
		char chart[]= {'a','A','1',' ','0'};
	
		for(int i=0;i<chart.length;i++) {
			if(Character.isWhitespace(' '))
				System.out.println();
			if(Character.isLowerCase('a'))
				System.out.println(chart[i]+"is lowercase");
			  i=i+3;
		}
		
		
		System.out.println();
		String sr="abc";
		String sr1=new String(sr);
		sr=sr.concat("d");
		System.out.println(sr+" "+sr1+" "+(sr==sr1)+" "+(sr.equals(sr1)));
		
		System.out.println();
		
		System.out.println();
		StringBuffer bu=new StringBuffer("abc");
		StringBuffer bu1=new StringBuffer(bu);
		bu.append("d");
		System.out.println(bu+" "+bu1+" "+(bu==bu1)+" "+(bu.equals(bu1)));
		System.out.println();
		System.out.println();

	
		
	}

}
