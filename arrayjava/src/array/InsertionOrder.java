package array;

public class InsertionOrder {

	static int temp;

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int ele = 6, p = 2;

		if (p > a.length + 1 || p <= 0) {
			System.out.println("Insertion is not possible");
		} else {
			int res[] = new int[a.length + 1];
			for (int i = 0, j = 0; i < res.length; i++) {
				if (i == (p - 1)) {
					res[i] = ele;
				} else {
					res[i] = a[j++];
				}
			}

			for (int i : res) {
				System.out.println(i);
			}

		}
		System.out.println("inserting into an array by skip the position of the value or (replacing)");
		m1();

	}

	public static void m1() {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int ele = 1, pos = 3;

		if (pos > arr.length + 1 || pos <= 0) {
			System.out.println(" insertion is not possible");
		} else {
			int res[] = new int[arr.length+1];
			for (int i = 0, j = 0; i < res.length; i++) {
				if (i == (pos - 1)) {
					temp = arr[j];
					res[i] = ele;
					j++;
					//System.out.println("the value " + temp);

				} else if (i == (pos + 2)) {
					res[i] = temp;
				}

				else {

					res[i] = arr[j++];

				}

			}
			for (int i : res) {
				System.out.print(i+" ");
			}
		}
	}

}
