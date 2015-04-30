package com.euler.project;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {

	static boolean OddIsPrime(long oddvalue)
	{
		for (long i = 3; i <= Math.sqrt(oddvalue); i += 2) {
			if (oddvalue % i == 0)
				return false;
		}
		return true;
	}

	private static void primeFactorizator(long n) {
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				if (OddIsPrime(i))
				{
					factors.add(i);
				}
			}
		}
		System.out.println(factors);

	}

	public static void main(String[] args) {
		primeFactorizator(600851475143L);

	}
}
