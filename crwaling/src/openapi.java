import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class openapi {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			//"publicdata/service/hr/getHR?"
			String urlstr = "http://data.kra.co.kr/"
					+"publicdata/service/race?_wadl&type=xml/publicdata/service/hr/getHR?" 
					+ "meet=1&ServiceKey=xsG1CbSd65zCFeWvh%2B27nNx6jwX2nWjFfMiuxpFif7pwxHocTEkgDeBwspXLeTYVLOcvfczAlr5zoCyZbRonow%3D%3D";
			URL url = new URL(urlstr);
			HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
			urlconnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
			String result = "";
			String line;
			while ((line = br.readLine()) != null) {
				result = result + line + "\n";
			}
			System.out.println(result);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}


public class openapi {
	
public static void main (String[] args){
	
	
	
	
	
}
}