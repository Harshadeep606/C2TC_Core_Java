package com.capgemini.javademo;

public class BreakAndContinueStatements {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				continue; // continue;
			}
			System.out.println(i);
		}

		System.out.println();
		for (int j = 1; j <= 10; j++) {
			if (j == 5) {
				break; // break;
			}
			System.out.println(j);
		}
	}
}
