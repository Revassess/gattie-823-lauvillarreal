package com.revature.tier1;

import java.util.*;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		System.out.println("num =" + num);
		long sum = 0;
		if (num == 1) {
			System.out.println("yes");
			return true;
		}
		ArrayList<Long> list = new ArrayList<>();
		long NUM = num;
		while (NUM > 0) {
			long val = NUM%10;
			list.add(val);
			NUM = NUM/10;
		}
		for (Long i : list) {
			sum += Math.pow(i, list.size());
			System.out.println(sum);
		
		}
		System.out.println(sum+ " " + num);
		if (sum == num) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}

}
