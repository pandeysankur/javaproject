package exception_Handling;

public class VotingMain {

	public static void main(String[] args) {

		int age = 16;
		try {
			if (age < 18) {
				throw new UnderAgeException();
			} else {
				System.out.println("You are eligible to Voting. ");
			}
		} catch (UnderAgeException e) {
			System.out.println(e);
		}

//		if(age<18) {
//			System.out.println("You are Not eligible to Voting. ");
//		}
//		else {
//			System.out.println("You are eligible to Voting. ");
//		}
		
		
	}

}
