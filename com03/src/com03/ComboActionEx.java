package com03;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	Container contentPane;
	String[] fruits = { "wifi", "key", "kiwi", "mango" };
	ImageIcon[] images = { new ImageIcon("images/wifi.jpg"),
			new ImageIcon("images/key.png"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg") };
	JLabel imgLabel = new JLabel(images[0]);

	ComboActionEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}
}