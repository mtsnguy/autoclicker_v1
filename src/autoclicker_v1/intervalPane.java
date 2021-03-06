package autoclicker_v1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class intervalPane extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField hours = new JTextField(4);
	private static JTextField mins = new JTextField(4);
	private static JTextField secs = new JTextField(4);
	private static JTextField millisecs = new JTextField(4);
	private JLabel h = new JLabel("hours ");
	private JLabel m = new JLabel("mins");
	private JLabel s = new JLabel("secs");
	private JLabel ms = new JLabel("milliseconds");
	
	public intervalPane() {
		hours.setText("0"); 
		mins.setText("0"); 
		secs.setText("0"); 
		millisecs.setText("100"); 
		setLayout(new GridBagLayout());
		setBorder(new CompoundBorder(new TitledBorder("Click Interval"),new EmptyBorder(8,3,8,3)));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.weightx = .1;

		
		add(hours,gbc);
		gbc.gridx++;
		add(h,gbc);
		
		gbc.gridx++;
		add(mins,gbc);
		gbc.gridx++;
		add(m,gbc);
		gbc.gridx++;
		
		add(secs,gbc);
		gbc.gridx++;
		add(s,gbc);
		gbc.gridx++;
		
		add(millisecs,gbc);
		gbc.gridx++;
		add(ms,gbc);

	}
	public static String getHours() {
		return hours.getText();
	}
	public static String getMins() {
		return mins.getText();
	}
	public static String getSecs() {
		return secs.getText();
	}
	public static String getMillisecs() {
		return millisecs.getText();
	}
	public void setHours(String h) {
		hours.setText(h);
	}
	public void setMins(String m) {
		mins.setText(m);
	}
	public void setSecs(String s) {
		secs.setText(s);
	}
	public void setMillisecs(String ms) {
		millisecs.setText(ms);
	}
}