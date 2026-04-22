package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinPosRequiredTeam {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String[] reqSkills = sc.nextLine().split(" ");
		Arrays.sort(reqSkills);
		Set<String> targetSkills = new HashSet<>(Arrays.asList(reqSkills));
		int n= Integer.parseInt(sc.nextLine());
		Map<String, Integer> keyMap = new HashMap<>();
		keyMap.put("", 0);
		for(int i =0;i<n;i++) {
			String s = sc.nextLine();
			String[] personSkills = s.split(" ");
			Map<String, Integer> updates = new HashMap<>();
			for(Map.Entry<String, Integer> entry : keyMap.entrySet()) {
				SortedSet<String> skills = new TreeSet<>();
				if(!entry.getKey().isEmpty()) {
					skills.addAll(Arrays.asList(entry.getKey().split(",")));
				}
				int bsize = skills.size();
				for(String perSkill : personSkills) {
					if(targetSkills.contains(perSkill)) {
						skills.add(perSkill);
					}
				}
				if(bsize==skills.size()) {
					continue;
				}
				boolean inKeyMapBetter =keyMap.containsKey(String.join(",",skills)) && keyMap.get(String.join(",",skills)) < entry.getValue()+1;
				boolean inupdateMapBetter =updates.containsKey(String.join(",",skills)) && updates.get(String.join(",",skills)) < entry.getValue()+1;
				
				if(!inKeyMapBetter && !inupdateMapBetter) {
					updates.put(String.join(",",skills), entry.getValue()+1);
				}
			}
			keyMap.putAll(updates);
		}
		System.out.printf("Required min people in a team to cover required skills is: %d",keyMap.get(String.join(",", reqSkills)));
	}
}
