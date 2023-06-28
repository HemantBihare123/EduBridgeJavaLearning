package com.learning.DecisionControl;

public class RightAngledTriangleDownside {
	
	public static void star_patter_downside(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}

	
	public static void star_pattern_same_number(int n, int num) {
		for(int i=num; i<num+n; i++) {
			for(int j=i; j<num+n; j++) {
				System.out.print(j +" ");
			}System.out.println("");
		}
	}
	
	
	
	public static void star_pattern_same_num_diff_row(int n, int num) {
		for(int i=num; i>num-n; i--) {
			for(int j=i; j>num-n; j--) {
				System.out.print(i+" ");
			}System.out.println();
		}
	}
	
	public static void star_pattern_same_num_diff_col(int n, int num) {
		for(int i=1; i<=n; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}
	public static void star_pattern_decremant(int n, int num) {
		for(int i=num; i>num-n; i--) {
			for(int j=i; j>num-n; j--) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}
	public static void star_pattern_ch(int n, char ch) {
		int change = ch;
		for(int i=change; i<=change+n; i++) {
			for(int j=i; j<change+n;  j++) {
				System.out.print((char)i +" ");
			}System.out.println("");
		}
	}
	
	public static void star_pattern_diff_ch(int n, char ch) {
		int change = ch;
		for(int i=change; i<=change+n; i++) {
			for(int j=i; j<change+n;  j++) {
				System.out.print(ch++ +" ");
			}System.out.println("");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		star_patter_downside(n);
		System.out.println("-------------------------------------------------");
		star_pattern_same_number(n, 5);
		System.out.println("-------------------------------------------------");
		star_pattern_same_num_diff_row(n,5);
		System.out.println("-------------------------------------------------");
		star_pattern_same_num_diff_col(n,5);
		System.out.println("-------------------------------------------------");
		star_pattern_decremant(n, 5);
		System.out.println("-------------------------------------------------");
		star_pattern_ch(n, 'a');
		System.out.println("-------------------------------------------------");
		star_pattern_diff_ch(n,'a');
		
	}

}
