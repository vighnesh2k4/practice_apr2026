package practice;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class LongestSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Set<Character> set = new HashSet<>();
		int max = -1;
		int startInd =0;
		for(int i =0; i<str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				int len = i-startInd;
				if(max<len) max = len;
				startInd = i;
			} else {
				set.add(str.charAt(i));
			}
		}
		System.out.println(max);
	}
}
