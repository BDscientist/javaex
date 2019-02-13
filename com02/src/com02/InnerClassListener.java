package com02;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame {
	InnerClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		add(btn);
	}

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			setTitle(b.getText()); // JFrame.setTitle() 호출
		}
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}
}