import java.io.*;
import java.net.*;

import javax.swing.*;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket serSocket = new ServerSocket(5001);

			Socket client = serSocket.accept();
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			BufferedReader r = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			String UserName = "";
			while (true) {

				if (UserName.equals("")) {
					UserName = r.readLine() + "("
							+ client.getInetAddress().getHostAddress() + ")";
					System.out.println("유저이름 저장완료!!!");
					continue;
				}

				String data = r.readLine().trim();

				if (data.equals("quit"))

					break;
				w.write(UserName + ":" + data + "\n");
				w.flush();

			}

			w.close();
			r.close();
			serSocket.close();
			client.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
