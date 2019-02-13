public class Variance {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = (double) sum / array.length;
		System.out.println("평균은" + average);
		// 분산

		double sum2 = 0, v;
		for (int i = 0; i < array.length; i++) {

			sum2 += Math.pow(array[i] - average, 2);
		}
		v = sum2 / array.length;
		System.out.println("분산은" + v);
	System.out.println("변동계수는"+average/v);
	System.out.println("편차 제곱의 합은"+sum2);
	}


}