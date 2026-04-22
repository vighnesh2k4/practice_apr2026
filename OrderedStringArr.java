package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OrderedStringArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			System.out.printf("Enter %d string: ",i+1);
			arr[i]=sc.nextLine();
		}
		int count=0;
		for(int i=0;i<arr[0].length();i++) {
			int j=0;
			while(j<n-1) {
				if(arr[j].charAt(i) > arr[j+1].charAt(i)) {
					count++;
					break;
				}
				j++;
			}
		}
		System.out.print(count);
	}
}
