public class pvalue {

	public static void main(String[] args) {

		int x = 20;
		int y = 15;
		int z = x / y;
		

		double n = Math.sqrt(0.21*0.75 / 20);
        double k=z+1.96*n;
	     double t=z-1.96*n;
	if(k>0.7||t<0.7){
		System.out.println("귀무가설을 기각하고 대립가설을 채택");
	}else{
		System.out.println("귀무가설을 기각하지못함");
	}
	}
}