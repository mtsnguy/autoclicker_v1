package autoclicker_v1;

import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class mainPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private intervalPane intervalpane = new intervalPane();
	private clickPane clickpane = new clickPane();
	private repeatPane repeatpane = new repeatPane();
	private locationPane locationpane = new locationPane();
	private startPane startpane = new startPane();
	private static Robot robot; //auto clicker robot class
	Thread test; //thread 
	private static boolean exitthread;
	
	public mainPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 0.33;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(4,4,4,4);
		
		add(intervalpane,gbc);
		gbc.gridy++;
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel.add(clickpane);
		panel.add(repeatpane);
		add(panel,gbc);
		
		gbc.gridy++;
		
		add(locationpane,gbc);
		gbc.gridy++;
		add(startpane,gbc);
 		
		startPane.startBtnActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startClick();
			}
		});
		startPane.stopBtnActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopClick();
			}
		});
	}
	public void startClick() {
		startPane.setRunning(true);
		startPane.start.setEnabled(false);
		startPane.stop.setEnabled(true);
		test = new Thread() {
			public void run() {
				try {
					try {
						robot = new Robot();
					}catch(Exception e) {
						e.printStackTrace();
					}
					exitthread = false;
					int hours = Integer.parseInt(intervalPane.getHours());
					int minutes = Integer.parseInt(intervalPane.getMins());
					int seconds = Integer.parseInt(intervalPane.getSecs());
					int milliseconds = Integer.parseInt(intervalPane.getMillisecs());
					int totalms = (hours * 3600000) + (minutes * 60000) + (seconds * 1000) + (milliseconds);
					
					System.out.println(clickPane.getType()+","+hours+","+totalms);
					Thread.sleep(totalms);
					while(!exitthread) {
						robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
						System.out.println("click click!!");
						robot.delay(totalms);
						
					}
					System.out.println("End of thread's life..");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		test.start();
		System.out.println("Running.. & Start the thread..");
	}
	public void stopClick() {
		stop();
		startPane.setRunning(false);
		startPane.start.setEnabled(true);
		startPane.stop.setEnabled(false);
	}
	public void stop() {
		exitthread = true;
	}
}