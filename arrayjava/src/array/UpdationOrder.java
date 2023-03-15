package array;

public class UpdationOrder {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int rep = 3, ele = 6;
		int ind = update(a, rep);
		if (ind == -1) {
			System.out.println(" updation is not possible");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == rep) {
					a[i] = ele;
				}
			}
			for (int i : a) {
				System.out.println(i);
			}

		}
	}

	public static int update(int a[], int e) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == e) {
				return i;
			}
		}
		return -1;
	}

}
