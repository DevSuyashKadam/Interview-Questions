package demo.interview;

import java.util.Arrays;
import java.util.HashSet;

public class PrintRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numbers= {1,2,3,4,2,5,6,3,4,7,8,5,2,3,4,4};
		HashSet<Integer>duplicates=new HashSet<>();
		
		HashSet<Integer>uniqueElements=new HashSet<>();
		
		for(int num:numbers) {
			if(uniqueElements.contains(num)) {
				duplicates.add(num);
			}else {
				uniqueElements.add(num);
			}
			
		}
		
		System.out.println("original Array   :"+Arrays.toString(numbers));
		System.out.println(uniqueElements);
		System.out.println("Array            :"+duplicates);
	}

}



/*In this modified program, we create two HashSet objects: duplicates to store the duplicate elements, and uniqueElements to store the unique elements encountered so far.

We iterate over the numbers array and check if the current number is already present in the uniqueElements set. If it is, we add it to the duplicates set. Otherwise, we add it to the uniqueElements set.

Finally, we print the original array using Arrays.toString() and the duplicate elements using duplicates.*/
