package autoclicker_v1;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class startPane extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton start = new JButton("Start");
	private JButton stop = new JButton("Stop(F6)");
	private JButton hotkey = new JButton("Hotkeys");
	private JButton help = new JButton("Help");
	public startPane() {
		start.setPreferredSize(new Dimension(200,40));
		stop.setPreferredSize(new Dimension(200,40));
		hotkey.setPreferredSize(new Dimension(200,40));
		help.setPreferredSize(new Dimension(200,40));
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
}