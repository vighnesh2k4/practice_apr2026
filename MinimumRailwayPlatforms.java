package practice;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinimumRailwayPlatforms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dep = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			dep[i]=sc.nextInt();
		} 
		int count =1;
		SortedSet<Integer> set = new TreeSet<>();
		set.add(dep[0]);
		for(int i=1;i<n;i++) {
				if(!set.isEmpty() && set.first()<arr[i]) {
					set.remove(set.first());
				} else {
					count++;
				}
				set.add(dep[i]);
		}
		System.out.print(count);
	}
}
