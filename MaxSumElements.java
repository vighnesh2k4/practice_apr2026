package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSumElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int maxGiven=sc.nextInt();
		List<Integer> sumArr = new ArrayList<>();
		int maxFound=0;
		sumArr.add(0);
		for(int i=0;i<size;i++) {
			int currentNum=arr[i];
			int sumArrSize = sumArr.size();
			for(int j=0;j<sumArrSize;j++) {
				int newSum = sumArr.get(j)+currentNum;
				if(newSum==maxGiven) {
					System.out.print(newSum);
					return;
				}else if(newSum<maxGiven) {
					sumArr.add(newSum);
					if(newSum>maxFound) {
						maxFound=newSum;
					}
				}
			}
		}
		System.out.print(maxFound);
	}
}
