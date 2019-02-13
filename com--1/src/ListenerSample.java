import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ListenerSample extends JFrame {

	ListenerSample (){
		
		
		
		setTitle("action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
	}

}
