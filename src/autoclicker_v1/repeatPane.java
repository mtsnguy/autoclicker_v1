package autoclicker_v1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class repeatPane extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JRadioButton radioNum = new JRadioButton("Repeat:");
	private JRadioButton radioForever = new JRadioButton("Repeat until stopped");
	private JTextField num = new JTextField(4);
	
	public repeatPane() {
		setLayout(new GridBagLayout());
		setBorder(new CompoundBorder(new TitledBorder("Click Repeat"),new EmptyBorder(20,15,18,15)));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		add(radioNum,gbc);
		gbc.gridx++;
		gbc.weightx = 1;
		add(num,gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		add(radioForever,gbc);
	}
	public String getSelectedButtonText() {
		if(radioNum.isSelected()) {
			return radioNum.getText();
		}else if(radioForever.isSelected()) {
			return radioForever.getText();
		}
		return "Error; nothing selected";
	}
}