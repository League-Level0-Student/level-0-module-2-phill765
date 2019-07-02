//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _08_safe_cracker;

import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SafeCracker {

	public static void main(String[] args) {
		/*
		 * Your mission: use the tryCode method to crack the safe by trying all possible
		 * combinations
		 */
		int attempt = 0;
		int N1 = 0;
		int N2 = 0;
		int N3 = 0;
		int N4 = 0;
		int N5 = 0;
		int N6 = 0;
		int N7 = 0;
		for (int i = 0; i < attempt; i++) {
			Random ran = new Random();
			N1 = ran.nextInt(10);
			N2 = ran.nextInt(10);
			N3 = ran.nextInt(10);
			N4 = ran.nextInt(10);
			N5 = ran.nextInt(10);
			N6 = ran.nextInt(10);
			N7 = ran.nextInt(10);
			attempt = N1+(N2*10)+(N3*100)+(N4*1000)+(N5*10000)+(N6*100000)+(N7*1000000);
			tryCode(attempt);
		}

	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);
		
		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}

	private static void playTheSoundOfSuccess() {
		try {
			AudioClip sound = JApplet.newAudioClip(SafeCracker.class.getResource("me-gusta.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
