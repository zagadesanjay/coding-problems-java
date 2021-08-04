package com.sz.cp;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(isPrime(23));

	}

	private static boolean isPrime(int n) {
		// 0 and 1 not prime numbers
		if (n <= 1)
			return false;
		// 2 is the only even prime number
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= n / 2; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
