package com.euler.project;

/**
 * Problem 4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Expected result: 906609
 * */

public class Problem4 {

	public static void main(String[] args) {
		int maxLimit = 999;
		int minLimit = 100;
		int prod = 0;
		int maxProd = 0;
		for (int i = maxLimit; i >= minLimit; i--) {
			for (int j = i; j >= minLimit; j--) {
				prod = i * j;
				if (isPalindrome(String.valueOf(prod)) && prod > maxProd) {
					maxProd = prod;
					System.out.println("The palindrome number is: " + prod);
				}
			}
		}
	}

	private static boolean isPalindrome(String product) {
		int lenght = product.length();
		boolean result = false;
		String reverseString = "";

		for (int i = lenght - 1; i >= 0; i--) {
			reverseString = reverseString + product.charAt(i);
		}
		if (product.equals(reverseString)) {
			result = true;
		}
		return result;
	}

}
