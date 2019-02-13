public class fouranswer {
	static double[] rowMeans(double[][] data) {
		double rowMeans[] = new double[data.length];

		for (int r = 0; r < data.length; r++) {
			double rsum = 0;
			for (int c = 0; c < data[0].length; c++) {
				rsum += data[r][c];

			}

			rowMeans[r] = rsum / data[0].length;

		}
		return rowMeans;

	}

	public static double[] rowSumsq(double[][] data) {

		double rsumsq[] = new double[data.length];
		double[] rmean = rowMeans(data);
		for (int r = 0; r < data[0].length; r++) {
			double sumsq = 0;
			for (int c = 0; c < data.length; c++) {
				sumsq += (data[r][c] - rmean[r]) * (data[r][c] - rmean[r]);

			}
			rsumsq[r] = sumsq;
		}
		return rsumsq;
	}

	public static double crossProd(double[][] data) {
		double cprod = 0;
		double[] rmean = rowMeans(data);
		for (int c = 0; c < data[0].length; c++) {
			double tprod = 1;
			for (int r = 0; r < data.length; r++) {
				tprod *= data[r][c] - rmean[r];
			}
			cprod += tprod;

		}
		return cprod;
	}

	public static void main(String[] args) {

		double[][] dt = {
				{ 1211, 1687, 2133, 2468, 3882, 1234, 5678, 1235, 3562 },
				{ 1255, 3215, 1235, 6573, 1235, 5531, 1234, 2313, 1245 } };
		System.out.println(crossProd(dt));
	}

}
