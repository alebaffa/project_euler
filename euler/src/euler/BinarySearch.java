package euler;

import java.util.Arrays;

public class BinarySearch {

	private static boolean isPresent(int i, int[] array) {
		int lo = 0;
		int hi = array.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			System.out.println("lo: " + lo + ", mid : " + mid + ", hi : " + hi);
			if (i < array[mid])
				hi = mid - 1;
			else if (i > array[mid])
				lo = mid + 1;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = { 84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 48, 33, 16, 77,
				11, 29 };
		Arrays.sort(array);
		System.out.println(isPresent(18, array));

	}

}
