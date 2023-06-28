package com.learning.DecisionControl;

public class RightAngledTriangle {

	public static void star_pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

	public static void char_star_pattern(int n, char ch) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println("");
		}
	}

	public static void same_char_star_pattern(int n, char ch) {
		int ch_to_integer = ch;
		// System.out.println(ch_to_integer);
		for (int i = ch_to_integer; i < ch_to_integer + n; i++) {
			for (int j = ch_to_integer; j <= i; j++) {
				System.out.print((char) i + " ");
			}
			System.out.println("");
		}
	}

	public static void same_char_same_col_star_pattern(int n, char ch) {
		int ch_to_integer = ch;
		// System.out.println(ch_to_integer);
		for (int i = ch_to_integer; i < ch_to_integer + n; i++) {
			for (int j = ch_to_integer; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println("");
		}
	}

	public static void same_number_star_pattern(int n, int num) {
		for (int i = num; i < num + n; i++) {
			for (int j = num; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

	public static void same_number_same_col_star_pattern(int n, int num) {
		for (int i = num; i < num + n; i++) {
			for (int j = num; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

	public static void decrement_number_star_pattern(int n, int num) {
		int num_dec = num;
		for (int i = num; i < num + n; i++) {
			for (int j = num; j <= i; j++) {
				System.out.print(num_dec + " ");
			}
			num_dec--;
			System.out.println();
		}
	}

	public static void decrement_col_number_star_pattern(int n, int num) {

		for (int i = num; i > num - n; i--) {
			for (int j = num; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		star_pattern(n);
		System.out.println("---------------------------------------------");
		char_star_pattern(n, 'a');
		System.out.println("---------------------------------------------");
		same_char_star_pattern(n, 'a');
		System.out.println("---------------------------------------------");
		same_char_same_col_star_pattern(n, 'a');
		System.out.println("---------------------------------------------");
		same_number_star_pattern(n, 1);
		System.out.println("---------------------------------------------");
		same_number_same_col_star_pattern(n, 1);
		System.out.println("---------------------------------------------");
		decrement_number_star_pattern(n, 5);
		System.out.println("---------------------------------------------");
		decrement_col_number_star_pattern(n, 5);
	}

}
