public class pvalue {

	public static void main(String[] args) {

		int x = 20;
		int y = 15;
		int z = x / y;
		

		double n = Math.sqrt(0.21*0.75 / 20);
        double k=z+1.96*n;
	     double t=z-1.96*n;
	if(k>0.7||t<0.7){
		System.out.println("�͹������� �Ⱒ�ϰ� �븳������ ä��");
	}else{
		System.out.println("�͹������� �Ⱒ��������");
	}
	}
}