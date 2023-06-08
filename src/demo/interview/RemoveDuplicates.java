package demo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numbers= {1,2,3,4,2,5,6,3,4,7,8,5,2,3,4,4};
		
	ArrayList<Integer>uniqueList=new ArrayList<>();
	
	for(int element :numbers) {
		if(!uniqueList.contains(element)) {
			
			uniqueList.add(element);
			
		}
	}

	
	Integer[]uniqueNumbers=uniqueList.toArray(new Integer[0]);
	
	
	System.out.println(Arrays.toString(uniqueNumbers));
}
}