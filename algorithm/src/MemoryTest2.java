class Exam {

	int c, d;

	public int add(int a, int b) {
		c = a + b;
		return c;
	}

	public int multi(int a, int b) {

		d = a * b;
		return d;

	}
}

public class MemoryTest2 {
	public static void main(String[] args) {
		int sum, multi;
		int x, y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]); // 1¹ø
		Exam obj1 = new Exam();
		Exam obj2 = new Exam(); // 2¹ø
		sum = obj1.add(10, 20);
		multi = obj2.multi(10, 20);
		System.out.println("add = " + sum);
		System.out.println("multipy = " + multi);
	}
}
