package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Roller {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you?");
	int heightint = Integer.parseInt(height);
	if (heightint<48) {
		JOptionPane.showMessageDialog(null, "You can't go on the roller coaster!");
	} else {
		JOptionPane.showMessageDialog(null, "You can go on the roller coaster!");
	}
}
}
