package autoclicker_v1;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class mainPanel extends JPanel{
	private intervalPane intervalpane = new intervalPane();
	private clickPane clickpane = new clickPane();
	private repeatPane repeatpane = new repeatPane();
	private locationPane locationpane = new locationPane();
	private startPane startpane = new startPane();
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
				System.out.println("OP");
			}
		});
	}
}