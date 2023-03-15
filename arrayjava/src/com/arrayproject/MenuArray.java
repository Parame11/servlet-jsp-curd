package com.arrayproject;

import java.util.Scanner;

public class MenuArray {

	static ArrayOperations ob = new ArrayOperations();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println(" Enter the Elements" + (i + 1));
			a[i] = sc.nextInt();
		}

		while (true) {
			System.out.println("\n1.Insert \n2.delete \n3.Update\n4.Sort\n5.Search"
					+ "\n6.Reverse\n7.Minimum\n8.Maximum\n9.Display\n10.IsEmpty\n11.Exit\n");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter new element");
				int new_ele = sc.nextInt();
				System.out.println("Enter the Position");
				int pos = sc.nextInt();
				a = ob.insert(a, new_ele, pos);
				ob.display(a);
				break;

			}
			case 2: {
				System.out.println("Enter the Delete Element");
				int d = sc.nextInt();
				a = ob.delete(a, d);
				ob.display(a);
				break;

			}
			case 3: {
				System.out.println("Enter the Replace Element");
				int re = sc.nextInt();
				System.out.println("Enter the new Element");
				int new_ele = sc.nextInt();
				ob.update(a, re, new_ele);
				ob.display(a);
				break;

			}
			case 4: {
				ob.sort(a);
				ob.display(a);
				break;

			}
			case 5: {
				System.out.println("Enter the Searching Element");
				int ele = sc.nextInt();
				int ind = ob.search(a, ele);
				if (ind == -1) {
					System.out.println("Element is not found");
				} else {
					System.out.println("Element is found at position " + (ind + 1));
				}
				break;
			}
			case 6: {
				int b[]=ob.reverse(a);
				ob.display(b);
				
				break;
			}
			case 7: {
				int min = ob.min(a);
				System.out.println("the Minimum value is " + min);
				break;

			}
			case 8: {
				int max = ob.max(a);
				System.out.println("the Maximum value is " + max);
				break;
			}
			case 9: {
				ob.display(a);
				break;
			}
			case 10 : {
				if (ob.isEmpty(a)) {
					System.out.println("Array is Empty");
				} else {
					System.out.println("Array is not Empty");
				}
				break;
			}
			case 11 : {
//				System.exit(option);
				System.exit(0);
				break;
			}
			default :{
				System.out.println("Invalid number please check the number");
			}

			}
		}
	}

}
