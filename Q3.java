package a1_RyanKing_40372847;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chLine(5, 'A');
		chLine(7, '8');
		numberSquare(10, 4);
		numberSquare(6, 3);
		numberSquare(99, 2);
		System.out.printf("Biggest prime below 100 is %d %n", biggestPrimeBelow(100));
		System.out.printf("Biggest prime below 3 is %d %n", biggestPrimeBelow(3));

	}

	public static void chLine(int value, char character) {
		for (int num1 = 0; num1 <= value; num1++) {
			System.out.print(character);

		}
		System.out.println("");
	}

	public static void numberSquare(int firstValue, int width) {
		for (int num2 = 0; num2 < width; num2++) {
			for (int num3 = 0; num3 < width; num3++) {
				System.out.printf(" %d", firstValue);
				firstValue++;

			}
			System.out.println("");
		}
	}

	public static boolean isPrime(int num4) {

		boolean result = true;
		for (int i = 2; i < num4; i++) {
			if (num4 % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static int biggestPrimeBelow(int startingNumber) {
		int largestPrime = 0;
		for (int num5 = startingNumber; num5 > 1; num5--) {
			if (isPrime(num5) == true) {
				largestPrime = num5;
				break;
			}
		}
		return largestPrime;
	}

}
