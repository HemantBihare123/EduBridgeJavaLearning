package com.learning.Arrays;

import java.util.Iterator;

public class DuplicateElements {
	public static int arr(int[] nums) {
		int rd=0;
        for(int i=1; i<nums.length; i++) {
        	if(nums[rd]!=nums[i]) {
        		rd++;
        		nums[rd]=nums[i];
        	}
        	
        }
//        rd is providing index till unique number. 
//        That's why rd+1 will give the length of the unique array.
        return rd+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,2,2,3,4,5};
        System.out.println("Given array is: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n"+"Resultant array is: ");
//		arr(nums);
//        for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i]+" ");
//		}System.out.println();
        int result= arr(nums);
        System.out.println(result);
        for (int i = 0; i < result; i++) {
        	System.out.print(nums[i]+" ");
        }
	
	}

}
