package euler;

public class Problem7 {

	private static boolean isPrime(long i) {
		if (i == 2)
			return true;
		if (i == 1)
			return true;
		if (i == 3)
			return true;
		if (i % 2 == 0)
			return false;
		for (int j = 3; j * j <= i; j += 2) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 14;
		int numOfPrime = 6;
		long sum = 0;
		for (long j = 2; j < 2000000; j++) {
			if (isPrime(j)) {
				System.out.println(j + " is prime");
				sum += j;
			}
		}
		System.out.println("sum is " + sum);
	}

}
