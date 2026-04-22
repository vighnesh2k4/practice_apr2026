package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePrefixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int cur=0;
		int count=0;
		for(int i=0;i<n;i++) {
			System.out.println(cur+" "+arr[i]+" "+ count+" "+(map.getOrDefault(cur, 0)+Integer.valueOf(1)));
			if(map.containsKey(cur+arr[i])) {
				count+=map.get(cur+arr[i]);
			}
			cur+=arr[i];
			map.put(cur, map.getOrDefault(cur, 0)+1);
		}
		System.out.print("hi "+count);
	}

}
