package com.learning.MultiDimesionalArrays;

public class ZeroOnEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{00,01,02},{10,11,12},{20,21,22}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i%2==0 || j%2==0) {
					System.out.print(0 +" ");
				}else {
					System.out.print(arr[i][j]+ " ");
				}
			}System.out.println();
		}

	}

}
