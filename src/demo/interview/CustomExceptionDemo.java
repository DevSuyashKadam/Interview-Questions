package demo.interview;



/*It is the example of custome exception
 * 
 * very important for interview
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
 class TooYoungException extends RuntimeException{
	
	TooYoungException(String s){
		super(s);
	}

}

class TooOldException extends RuntimeException{
	
	TooOldException(String s){
		super();

		
	}
}

class CustomExceptionDemo{
	
	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		
		if(age>60) {
			
			throw new TooOldException("Younger age is already over");
		}
		
		else {
			throw new TooYoungException("Please wait for some time");
		}
	}

}
