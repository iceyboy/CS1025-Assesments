package a1_RyanKing_40372847;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int userNumber;

		boolean restart = true;
		do {
			System.out.println("Please enter a number from 1 to 5: ");
			userNumber = keyboardInput.nextInt();

			if (userNumber >= 1 && userNumber <= 3) {
				System.out.println("*** Your call is important to us please hold");
				restart = true;
			} else if (userNumber == 4) {
				System.out.println("*** I'm sorry we can't help you");
				restart = true;
			} else if (userNumber == 5) {
				System.out.println("*** Switch it off and on again");
				restart = true;
			} else {
				System.out.println("*** I can't believe you did that! Try again");
				restart = false;
			}

		} while (restart == false);

		System.out.println("Please enter your name: ");
		keyboardInput.nextLine();
		String userName = keyboardInput.nextLine();
		System.out.println("*** Goodbye " + userName + " have a nice day");

		keyboardInput.close();
	}

}
