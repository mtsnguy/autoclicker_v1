package autoclicker_v1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class clickPane extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel clickLabel = new JLabel("Click type: ");
	private JLabel xLabel = new JLabel("Mouse Button: ");
	private static String[] choices1 = {"Single","Double"};
	private static String[] choices2 = {"Left","Right"};
	private static JComboBox<String> clickType = new JComboBox<String>(choices1);
	private static JComboBox<String> xType = new JComboBox<String>(choices2);
	public clickPane() {
		setLayout(new GridBagLayout());
		setBorder(new CompoundBorder(new TitledBorder("Click Options"),new EmptyBorder(15,10,5,15)));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		add(xLabel,gbc);
		gbc.gridx++;
		add(xType,gbc);
		gbc.gridx = 0;
		gbc.insets = new Insets(8,0,8,0);
		gbc.gridy++;
		add(clickLabel,gbc);
		gbc.gridx++;
		add(clickType,gbc);

	}
	public static String getType() {
		return (String) clickType.getSelectedItem();
	}
	public static String getPlaceholder() {
		return (String) xType.getSelectedItem();
	}

}