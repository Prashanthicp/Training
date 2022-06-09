package com.cashapona.string.jun07;

import java.util.Scanner;

public class CharacterExample {
	private static Scanner sc;

	public static void main(String[] args) {
		String str;
		int i;

		sc = new Scanner(System.in);

		System.out.print("\n Please Enter any String to Print =  ");
		str = sc.nextLine();

		for (i = 0; i < str.length(); i++) {
			System.out.println("The Character at Position " + i + " =  " + str.charAt(i));
		}
	}
}