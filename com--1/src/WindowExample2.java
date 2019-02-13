import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class WindowExample2 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("hello java");
		frame.setPreferredSize(new Dimension(200, 70));
		frame.setLocation(500, 400);
		Container contentPane = new Container();
		JTextField text = new JTextField();
		JButton button = new JButton("»Æ¿Œ");
		JLabel label = new JLabel("hello");
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		ActionListener listenr = 
				new ConfirmButtonActionListener(text, label,
				button.addActionListener(listener);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
	
	}
}
