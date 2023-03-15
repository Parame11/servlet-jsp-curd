package array;

public class NthMaxValue {

	public static void main(String[] args) {
		int n=4;
		int a[]= {6,4,3,2,5,8,9,1};
		int i=0;
		for(i=0; i<n;i++) {
			int max=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[max]<a[j]) {
					max=j;
				}
			}
			int temp=a[max];
			a[max]=a[i];
			a[i]=temp;
		}
		System.out.println(a[i-1]+"   ");

		for(int k:a) {
			System.out.print(k+"  ");
		}
	}

}
