package autoclicker_v1;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class startPane extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static boolean running = false;
	static JButton start = new JButton("Start(F6)");
	static JButton stop = new JButton("Stop(F6)");
	JButton hotkey = new JButton("Hotkeys");
	JButton help = new JButton("Help");
	public startPane() {
		start.setPreferredSize(new Dimension(200,40));
		stop.setPreferredSize(new Dimension(200,40));
		hotkey.setPreferredSize(new Dimension(200,40));
		help.setPreferredSize(new Dimension(200,40));
		stop.setEnabled(false);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		add(start,gbc);
		gbc.gridx++;
		gbc.weightx = 1;
		gbc.weighty = 1;
		add(stop,gbc);
		gbc.gridx = 0;
		gbc.insets = new Insets(8,8,8,8);
		gbc.gridy++;
		add(hotkey,gbc);
		gbc.gridx++;
		add(help,gbc);
		
	}
	public static void setRunning(boolean status) {
		startPane.running = status;
	}
	public static boolean getRunning() {
		return startPane.running;
	}
	public static void startBtnActionListener(ActionListener e){
		start.addActionListener(e);
	}
	public static void stopBtnActionListener(ActionListener e){
		stop.addActionListener(e);
	}
}