package com.learning.DecisionControl;

public class PatternPrinting {

	public static void right_angled_triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void right_angled_triangle_downside(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void left_angled_triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void left_angled_triangle_downside(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void equilateral(int n) {
		
			for (int i = 1; i <= n; i++) {
				for (int j = n; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}

	

	public static void dimond(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=5; j>=i; j--) {
				System.out.print(" *");
			}System.out.println();
		}
	}
	
	public static void rightPascalTriangle(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}for(int i=1; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public static void leftPascalTriangle(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}for(int j=n; j>i; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		right_angled_triangle(n);
		System.out.println("---------------------------------------------------------");
		right_angled_triangle_downside(n);
		System.out.println("---------------------------------------------------------");
		left_angled_triangle(n);
		System.out.println("---------------------------------------------------------");
		left_angled_triangle_downside(n);
		System.out.println("---------------------------------------------------------");
		equilateral(n);
		System.out.println("---------------------------------------------------------");
		dimond(n);
		System.out.println("---------------------------------------------------------");
		rightPascalTriangle(n);
		System.out.println("---------------------------------------------------------");
		leftPascalTriangle(n);

	}

}
