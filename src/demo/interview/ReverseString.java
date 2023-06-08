package demo.interview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city="Mumbai";
		
		
		StringBuilder sb=new StringBuilder(city);
		
		
		StringBuilder reverse=sb.reverse();
		
		String rev=reverse.toString();
		
		System.out.println("Input string    :"+city);
		System.out.println("reverse String  :"+rev);
	}

}


//by using string buffer

/*In this example, we declare a string input with the value "Hello, World!". We create a StringBuilder object sb with the input string.

We then call the reverse() method on the sb object to reverse the string. The reverse() method modifies the StringBuilder object in place.

Next, we convert the StringBuilder object reversed back to a string using the toString() method and store it in the output variable.

Finally, we print both the original string and the reversed string.


*/