package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int count=0;
		int k=sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0,1);
		int currentSum=0;
		for(int i=0;i<n;i++) {
			currentSum+=arr[i];
			if(map.containsKey(currentSum-k)){
				count++;
			}
			map.put(currentSum, map.getOrDefault(currentSum,0)+1);
		}
		System.out.print(count);
	}
}
