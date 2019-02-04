import java.util.*;



public class Cryptograph {
	 static long encrypt(int[] numbers) {

		long ans = 0;
		for (int i = 0; i < numbers.length; i++) {

			long temp = 1;
			for (int j = 0; j < numbers.length; j++) {

				if (i == j) {
					temp *= (numbers[j] + 1);
				} else {
					temp *= numbers[j];
				}

			}
			ans = Math.max(ans, temp);
		}

		return ans;
	}

	public static void main(String[] args) {
		Cryptograph nm = new Cryptograph();
		int[] numbers = { 1, 2, 1 };
		long a=encrypt(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.println(nm);
	}
}
