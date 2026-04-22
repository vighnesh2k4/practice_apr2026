package practice;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaxSubStrWithNoCommonChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count =0;
		int i=0;
		while(i<str.length()) {
			SortedSet<Integer> ss = new TreeSet<>();
			int temp = str.lastIndexOf(str.charAt(i));
			for(int j=i;j<=temp;j++) {
				ss.add(str.lastIndexOf(str.charAt(j)));
			}
			count++;
			i=ss.last()+1;
		}
		System.out.print(count);
	}
}
