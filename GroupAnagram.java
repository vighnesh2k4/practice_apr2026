package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wordsLine = sc.nextLine();
		String[] words = wordsLine.split(" ");
		Map<String, List<String>> groups = new HashMap<>();
		for(String word: words) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			groups.putIfAbsent(new String(chars), new ArrayList<>());
			groups.get(new String(chars)).add(word);
		}
		for(Map.Entry<String, List<String>>  entry : groups.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}
