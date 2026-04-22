package practice;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FractionalKnapsack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] val = new int[n];
		int[] wei = new int[n];
		for(int i=0;i<n;i++) {
			val[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			wei[i]=sc.nextInt();
		}
		Map<Double, Integer> map = new TreeMap<>(Comparator.reverseOrder());
		for(int i=0;i<n;i++) {
			map.put((double) val[i]/wei[i], wei[i]);
		}
		int w =sc.nextInt();
		int profit=0;
		for(Map.Entry<Double, Integer> entry: map.entrySet()) {
			int value = entry.getValue();
			if(value<w) {
				w-=value;
				profit+=entry.getKey()*value;
			} else {
				profit+=entry.getKey()*w;
				break;
			}
		}
		System.out.print(profit);
	}
}