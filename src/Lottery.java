import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	int L1 = 0;
	int L2 = 0;
	int L3 = 0;
	int L4 = 0;
	int L5 = 0;
	Random ran = new Random();
	L1 = ran.nextInt((9-1)+1)+1;
	L2 = ran.nextInt((9-1)+1)+1;
	L3 = ran.nextInt((9-1)+1)+1;
	L4 = ran.nextInt((9-1)+1)+1;
	L5 = ran.nextInt((9-1)+1)+1;
	JOptionPane.showMessageDialog(null, "The Lotto number is... "+L1+L2+L3+L4+L5);
}
}
