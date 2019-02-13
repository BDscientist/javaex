public class CopyOffour {

	static double[] rowMeans(double[][] x) {
		double rowMeans[] = new double[x.length];
		double[] sum = new double[x.length];
		for (int r = 0; r < x.length; r++) {
			double rsum = 0;
			for (int c = 0; c < x[0].length; c++) {
				rsum += x[r][c];
				rowMeans[r] = rsum / x[0].length;
				sum[r] += Math.pow(x[r][c] - rowMeans[r], 2);

			}

		}

		return sum;

	}

	public static void main(String[] args) {

		double score[][] = {
				{ 1211, 1687, 2133, 2468, 3082, 3643, 4267, 4804, 5439 },
				{ 1802, 2511, 3016, 3694, 3555, 5298, 5738, 6426, 6964 } };
		double rm[] = rowMeans(score);

		for (int i = 0; i < rm.length; i++)
			System.out.println(rm[i]);

	}

}
