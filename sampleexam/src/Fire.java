import java.util.Scanner;

public class Fire {

	public static void main(String[] args) {
		System.out.println("온도를 한번써봐!!!!!~~~~");
		Scanner scan = new Scanner(System.in);

		double c = scan.nextDouble();

		double f = c * 33.8;
		System.out.println("온도는,   " + c + "화시로 바꾼값은    " + f);
scan.close();
	}

}
