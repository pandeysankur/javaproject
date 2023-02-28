package exception_Handling;

public class UnderAgeException extends Exception {

	UnderAgeException(){
		
	}
	
	@Override
	public String toString() {
		
		return "You are not eligible to Voting";
	}
}
