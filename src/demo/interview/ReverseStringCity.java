package demo.interview;

public class ReverseStringCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city="Mumbai";
		System.out.println(city);
		System.out.println(city.length());
		
	String revcity="";
	
	for(int i=city.length()-1;i>=0;i--) {
		System.out.println();
		
		revcity=revcity+city.charAt(i);
		
	}
		
	System.out.println(revcity);
	
	}

}
