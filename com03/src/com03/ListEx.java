package com03;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	Container contentPane;
	String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach",
			"berry", "strawberry", "blackberry" };
	ImageIcon[] images = { new ImageIcon("images/wifi.jpg"),
			new ImageIcon("images/key.png") };

	ListEx() {
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JList strList = new JList(fruits);
		contentPane.add(strList);
		JList imageList = new JList();
		imageList.setListData(images);
		contentPane.add(imageList);
		JList scrollList = new JList(fruits);
		contentPane.add(new JScrollPane(scrollList));
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListEx();
	}
}