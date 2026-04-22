package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer>  nums = new ArrayList<>();
		while(true) {
			int num = sc.nextInt();
			if(num==-1) break;
			nums.add(num);
		}
		Collections.sort(nums);
		int n = nums.get(nums.size()-1);
		int expected = n*(n+1)/2;
		int actual = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(expected-actual);
	}
}
