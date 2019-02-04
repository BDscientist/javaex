import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;

public class client {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("서버 아이피를 입력 하시오!!!!!");
			String ip = sc.nextLine();

			Socket socket = new Socket(InetAddress.getByName(ip), 5001);

			String UserName = "";
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader r = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			while (true) {

				if (UserName.equals("")) {

					System.out.println("유저 이름설정:");

					String str = sc.next();
					w.write(str + "\n");
					w.flush();

					UserName = str;
					continue;
				}
				System.out.println("채팅할말!!!~~~~");
				String str = sc.next();

				w.write(str + "\n");
				w.flush();

				if (str.equals("quit"))
					break;
				String data = r.readLine().trim();
				System.out.println(data);

			}

			socket.close();
			w.close();
			r.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
