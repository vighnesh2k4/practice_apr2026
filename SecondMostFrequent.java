package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondMostFrequent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Map<Integer, Integer> count = new HashMap<>();
		for(int i =0; i<size; i ++) {
			int num = sc.nextInt();
			if(count.containsKey(num)) {
				count.put(num, 1+count.get(num));
			} else {
				count.put(num, 1);
			}
		}
		int firstMax = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int firstElement = -1;
		int secElement = -1;
		for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
			int num = entry.getKey();
			int freq = entry.getValue();
			if(freq > firstMax) {
				secMax = firstMax;
				firstMax = freq;
				secElement = firstElement;
				firstElement = num;
			} else if(freq > secMax && freq!=firstMax) {
				secMax = freq;
				secElement = num;
			}
		}
		if(secElement!=-1) {
			System.out.println(secElement);
		} else {
			System.out.println("I am else");
		}
	}
}
