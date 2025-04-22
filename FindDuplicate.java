package Set1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("A","B","C","A","D","B");
		
		Set<String> seen = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		for (String item: list) {
			if (!seen.add(item)) {
				duplicates.add(item);
			}
		}
		System.out.println("Duplicates:" + duplicates);
	}

}
