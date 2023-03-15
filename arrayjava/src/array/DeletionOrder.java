package array;

public class DeletionOrder {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int d=3;
		int ind=search(a, d);
		if(ind==-1) {
			System.out.println(" Deletion is not possible");
		}else {
			int res[]=new int[a.length-1];
			for(int i=0,j=0;i<a.length;i++) {
				if(ind!=i) {
					res[j++]=a[i];
				}
			}
			for(int i: res) {
				System.out.println(i);
			}
		}
	}
	
	public static int search(int a[],int e) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) {
				return i;
			}
		}
		return -1;
	}

}
