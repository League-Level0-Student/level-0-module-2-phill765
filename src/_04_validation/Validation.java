//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Nice Job!");
		} else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "Way to be!");
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Wow!");
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You're great!");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "Super job!");
		} else if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "Fantastic!");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
