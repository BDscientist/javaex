class Point {
	private int x, y; // grobal variable ,전역변수

	void setPoint(int x, int y) { // local ,지역변수
		this.x = x;
		this.y = y;

	}

	void showPoint() {
		System.out.println("  (" + x + " , " + y + "  )");

	}

}
