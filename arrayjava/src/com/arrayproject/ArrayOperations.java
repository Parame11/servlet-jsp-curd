package com.arrayproject;

public class ArrayOperations {
	
	public static int[] insert(int a[],int new_ele, int pos) {
		
		if(pos<=0 || pos>a.length+1) {
			System.out.println("Insertion is not possible");
			return a;
		}else {
			int res[]=new int[a.length+1];
			for(int i=0,j=0;i<res.length;i++) {
				if(i==pos-1) {
					res[i]=new_ele;
				}else {
					res[i]=a[j++];
				}
			}
			return res;
		}
		
	}
	
	public static int[] delete(int a[],int d) {
		
		int ind =search(a, d);
		if(ind==-1) {
			System.out.println("Deletion is not possible");
			return a;
		}else {
			int res[]=new int[a.length-1];
			for(int i=0,j=0;i<a.length;i++) {
				if(i!=ind) {
					res[j++]=a[i];
				}
			}
			return res;
		}
		
		
	}
	
	public static void update(int a[],int re,int new_ele) {
		int ind=search(a, re);
		if(ind==-1) {
			System.out.println("Updation is not possible");
		}else {
			for(int i=0;i<a.length;i++) {
				if(a[i]==re) {
					a[i]=new_ele;
				}
			}
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
		}
		
	}
	
	public static void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-1;j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
			}
		}
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
		
	}
	
	public static int search(int a[],int e) {
	  for(int i=0;i<a.length;i++) {
		  if(a[i]==e) {
			  return i;
		  }
	  }
	  return -1;
	}
	
	public  static int[] reverse(int a[]) {
		int res[]=new int[a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			res[j]=a[i];
	
		}
		return res;
		
	}
	
	public static int min(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		return min;
		
	}
	
	public static int max(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max ) {
				max=a[i];
			}
		}
		return max;
		
	}
	
	public static void display(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}
	
	public static boolean isEmpty(int a[]) {
		return a.length==0;
	}
	

}
