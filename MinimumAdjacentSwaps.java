package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumAdjacentSwaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> lst =new ArrayList<>();
		int[] nar = new int[n];
		for(int i =0;i<n;i++) {
			lst.add(sc.nextInt());
		}
		for(int i =0;i<n;i++) {
			nar[i]=sc.nextInt();
		}
		int count=0;
		for(int i=n-1; i>=0;i--) {
			int temp=lst.indexOf(nar[i]);
			if(temp>i) {
				count+=(temp-i-count);
			} else {
				count+=(i-temp);
			}
			lst.remove(Integer.valueOf(nar[i]));
		}
		System.out.print(count);
	}
}
