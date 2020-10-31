package duplicateValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String arr[]= {"G", "e", "e", "k", "s"};
		List<String>l =Arrays.asList(arr);
		System.out.println("Before duplication" + l);
		Set uniqueElement= new HashSet();
		for(String s: arr) {
			uniqueElement.add(s);	
		}
		System.out.println("After duplication" +uniqueElement);

	}

}
