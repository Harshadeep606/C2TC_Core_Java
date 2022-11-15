package com.capgemini.javademo;

public class SwitchCaseInJava2 {

	public static void main(String[] args) {
		char character = 'F';
		switch (character) {
		case 'a':
		case 'A':
			System.out.println("The value of character is a");
			break;
		case 'b':
		case 'B':
			System.out.println("The value of character is b");
			break;
		case 'c':
		case 'C':
			System.out.println("The value of character is c");
			break;
		default:
			System.out.println("The value of character is other than a,b,c");
			break;
		}

	}

}
