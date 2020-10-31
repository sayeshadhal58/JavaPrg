package duplicateElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		

		Integer arr [] = {1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5};
		List<Integer>  numlist =Arrays.asList(arr);
		System.out.println("Before duplicate"+ numlist);
		Set uniqueElements = new HashSet();
		for (Integer n : numlist) {		
			uniqueElements.add(n);
		}
		System.out.println("After duplicate"+ uniqueElements);

}
}
