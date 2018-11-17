package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main metho\nd make sure your program can run
	public static void main(String[] args) {

		// 2. Make a String variable to hold the value of Pi. You could use
		// http://www.piday.org/million/ for the value.
		String pi = "3.1415926535";
		// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second
		// is "pi.charAt(1)"
		for (int i = 0; i < 10; i++) {
			System.out.print(pi.charAt(i));
		}
		System.out.println("");
		System.out.println(pi.substring(0, 10));
		// TODO Auto-generated method stub

		// 4. Print ALL the digits of of Pi (hint: use a loop)
		for (int i = 0; i < pi.length(); i++) {
			System.out.print(pi.charAt(i));
			speak(pi.charAt(i));
		}
		System.out.println("");
		// 5. Use the speak() method to speak all the digits of Pi.

		// [ADVANCED]
		// *6. Get a character from the user using the getInputFromUser() method

		// *7. Compare the users' char to the next digit of Pi
		char user_ch = getInputFromUser();
		System.out.println("test " + user_ch);
		if (user_ch == '8') {
			System.out.println("Correct");
		} else {
			System.err.println("incorrect");
		}

		// *8. If they are correct, print out "correct". If they are not, print
		// "incorrect" to System.err.println
	}

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}
