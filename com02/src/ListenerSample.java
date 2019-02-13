import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerSample extends JFrame {
	ListenerSample() {
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();// 중요하다!!~~~~~~~~~~
		btn.addActionListener(listener);// 중요하다!!~~~~~~~~~~
		add(btn);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListenerSample();
	}
}

class MyActionListener implements ActionListener {// 중요하다!!~~~~~~~~~~
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}