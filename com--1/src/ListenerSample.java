import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ListenerSample extends JFrame {

	ListenerSample (){
		
		
		
		setTitle("action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
	}

}
