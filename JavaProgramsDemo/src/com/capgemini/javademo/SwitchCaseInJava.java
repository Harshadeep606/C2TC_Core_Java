package com.capgemini.javademo;

public class SwitchCaseInJava {

	public static void main(String[] args) {
		int number = 10;

		if (number == 1) {
			System.out.println("The value of number is 1");
		} else if (number == 2) {
			System.out.println("The value of number is 2");
		} else if (number == 3) {
			System.out.println("The value of number is 3");
		} else {
			System.out.println("The value of number is other than 1,2,3");
		}

		switch (number) {
		case 1:
			System.out.println("The value of number is 1");
			break;
		case 2:
			System.out.println("The value of number is 2");
			break;
		case 3:
			System.out.println("The value of number is 3");
			break;
		default:
			System.out.println("The value of number is other than 1,2,3");
			break;

		}

	}

}
