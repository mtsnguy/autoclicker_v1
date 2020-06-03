package autoclicker_v1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class locationPane extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField locX = new JTextField(4);
	private JTextField locY = new JTextField(4);
	private JRadioButton pLocation = new JRadioButton();
	private JRadioButton cLocation = new JRadioButton("Current Location");
	private JButton pickLocation = new JButton("Pick Location");
	private JLabel pXLabel = new JLabel("X:");
	private JLabel pYLabel = new JLabel("Y:");
	public locationPane() {
		setLayout(new GridBagLayout());
		setBorder(new CompoundBorder(new TitledBorder("Cursor Position"),new EmptyBorder(8,3,8,3)));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		add(cLocation,gbc);
		gbc.gridx++;
		gbc.weightx = 0.5;
		add(pLocation,gbc);
		gbc.gridx++;
		add(pickLocation,gbc);
		gbc.gridx++;
		gbc.weightx = 0.5;
		
		add(pXLabel,gbc);
		gbc.gridx++;
		add(locX,gbc);
		gbc.gridx++;
		gbc.weightx = 0.5;
		
		add(pYLabel,gbc);
		gbc.gridx++;
		add(locY,gbc);

	}
	public String getXloc() {
		return locX.getText();
	}
	public String getYloc() {
		return locY.getText();
	}
	public String getSelect() {
		return "place";
	}

	public void setX(String h) {
		locX.setText(h);
	}
	public void setY(String m) {
		locY.setText(m);
	}
	public void setSelect(String s) {
		
	}
}