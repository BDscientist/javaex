import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		System.out.println("13�� �Ǽ� �Է���~~~~~~~~~~!!!!!!!");
		Scanner scan = new Scanner(System.in);
		double mini = 0;
		double max = 0;
		for (int i = 1; i <= 13; i++) {
			double a = scan.nextDouble();
			if (a > max)
				max = a;
			if (a < mini)
				mini = a;

		}
		System.out.println("����ū����" + max + "�̰�,������������" + mini + "�Դϴ�,���� �μ��� ����"+(max-mini)+"�Դϴ�");
	}

}
