package a3;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
	}

	public static double mean(int[] nums) {

		double mean = 0;

		try {

			int total = 0;

			for (int loop = 0; loop < nums.length; loop++) {
				total += nums[loop];
			}

			mean = total / nums.length;

		} catch (IllegalArgumentException illegalargumentexception) {

			System.out.println("The array you are using is null.");

		} catch (ArithmeticException arithmeticexception) {

			System.out.println("The array you are using is null.");

		}

		return mean;

	}

	public static double median(double[] nums) {

		double median = 0;

		try {

			Arrays.sort(nums);

			if (nums.length % 2 == 0) {

				median = (nums[nums.length - (nums.length / 2)] + nums[nums.length - (nums.length / 2) - 1]) / 2;

			}

			else {

				median = nums[(nums.length / 2) + (nums.length % 2) - 1];

			}

		} catch (IllegalArgumentException illegalargumentexception) {

			System.out.println("The array you are using is null.");

		} catch (ArithmeticException arithmeticexception) {

			System.out.println("The array you are using is null.");

		} catch (ArrayIndexOutOfBoundsException outofbounds) {

			System.out.println("The array you are using is null.");

		}

		return median;

	}

}
