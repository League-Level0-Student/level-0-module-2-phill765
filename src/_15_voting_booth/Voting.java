package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageint = Integer.parseInt(age);
	if (ageint<18) {
		JOptionPane.showMessageDialog(null, "No one cares what you think!");
	} else {
		JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
	}
}
}
