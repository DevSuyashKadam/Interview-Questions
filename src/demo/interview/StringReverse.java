package demo.interview;

public class StringReverse {

	
	public static void main(String[] args) {
		
		String city="New York";
		String reverse="";
		
		
		for(int i=city.length()-1;i>=0;i--) {
			
			reverse+=city.charAt(i);
		}
		
		System.out.println("original String    :"+city);
		System.out.println("reverse String     :"+reverse);
	}
}


/*
 * 
 * In this example, we declare a string input with the value "New York". We initialize an empty string reversed to store the reversed string.

The for loop starts from input.length() - 1 (the index of the last character) and iterates backwards until it reaches 0. In each iteration, it retrieves the character at the current index using input.charAt(i) and concatenates it to the reversed string.

Finally, we print both the original string and the reversed string.
 * 
 * 
 * 
 * */
