package exception_Handling;

public class FinallyException {

	public static void main(String[] args) {
		try {
			int data =10/0;
			System.out.println(data);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block always Executed");
		}
		System.out.println("Your Code is executed succesfully Done");
	}

}
