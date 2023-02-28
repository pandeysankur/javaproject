package exception_Handling;

public class Example02 {

	public static void main(String args[]) {
		int value;
		try

		{
			int array[] = { 6, 16, 26, 36, 46, 56, 66, 76 };
			int index = 9;
			value = array[index];
			System.out.println("valid index.");

		}

		catch (ArrayIndexOutOfBoundsException e)

		{
			System.out.println("Valid indexes are: 0,1,2,3,4,5,6,7");
		}
		System.out.println("End of program");

	}
}
