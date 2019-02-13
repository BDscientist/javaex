import java.util.Scanner;

public class expo {

	public static void main(String[] args) {
		System.out.println("아무숫자나 누르세요!!!!!");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double sum = 1;
		for (int i = 1; i <= 5; i++) {
			sum *=i;
			double m = Math.pow(x, i);
			System.out.println(1 + (m / sum));
		}

	}

}
