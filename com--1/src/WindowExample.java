import java.awt.*;
import javax.swing.*;

public class WindowExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("hello java");
		frame.setPreferredSize(new Dimension(200, 70));//���� ����
		frame.setLocation(500, 400);//x��ǥ y��ǥ
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JButton button = new JButton("Ȯ��");
		JLabel label = new JLabel("hello");
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
