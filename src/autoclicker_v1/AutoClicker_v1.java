package autoclicker_v1;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class AutoClicker_v1 {
	public static void main(String[] args) {
		new AutoClicker_v1();
	}
	//Constructor Class to initiate JFrame
	public AutoClicker_v1() {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run() {
				JFrame frame = new JFrame("AutoClicker V1");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new mainPanel());
				frame.pack();
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}
