package com.arrayproject;

public class Array_Test {

	public static void main(String[] args) {

		ArrayOperations ao=new ArrayOperations();
		
		int a[]= {6,9,2,3,4,5};
		int ele=3;
		int pos=3;
		int new_ele=6;
		int re=3;
		//a=ao.insert(a, ele, pos);
		ao.display(a);
		
		System.out.println();
		//a=ao.delete(a, ele);
		//ao.update(a, re, new_ele);
		//ao.sort(a);
		//System.out.println(ao.search(a, ele));
		
//		int arnew[]=ao.reverse(a);
//		ao.display(arnew);
//		int min=ao.min(a);
//		System.out.println("the minimum value "+min);
		
		//int max=ao.max(a);
		//System.out.println("the minimum value "+max);
//		ao.display(arnew);
		//System.out.println(ao.isEmpty(a));
		int b[]=ao.reverse(a);
		for(int x:b) {
			System.out.println(x);
		}
	}

}
