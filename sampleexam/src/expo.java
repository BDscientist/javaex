import java.util.Scanner;

public class expo {

	public static void main(String[] args) {
		System.out.println("�ƹ����ڳ� ��������!!!!!");
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
