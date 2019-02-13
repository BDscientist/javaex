import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		System.out.println("13개 실수 입력해~~~~~~~~~~!!!!!!!");
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
		System.out.println("가장큰수는" + max + "이고,가장작은수는" + mini + "입니다,따라서 두수의 차는"+(max-mini)+"입니다");
	}

}
