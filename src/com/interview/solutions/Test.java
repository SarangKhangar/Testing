package com.interview.solutions;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
	
		int ind = nums.indexOf(4);
		nums.set(ind, 40);
		
		for(int i: nums) {
			System.out.println(i);
		}
		
	}
	
}
