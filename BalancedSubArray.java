package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancedSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int currentSum=0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				currentSum--;
			}else {
				currentSum++;
			}
			if(map.containsKey(currentSum)) {
				count+=map.get(currentSum);
			}
			map.put(currentSum, map.getOrDefault(currentSum,0)+1);
		}
		System.out.println(count);
	}
}
