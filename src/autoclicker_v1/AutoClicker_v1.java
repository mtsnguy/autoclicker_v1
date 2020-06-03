package autoclicker_v1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

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
	/*		interval_panel.setBackground(Color.green);
		click_panel.setBackground(Color.red);
		repeat_panel.setBackground(Color.blue);
		location_panel.setBackground(Color.yellow);
		start_panel.*/
	//Create the Panes
	//Create Interval Pane class
	
	public class intervalPane extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JTextField hours = new JTextField(4);
		private JTextField mins = new JTextField(4);
		private JTextField secs = new JTextField(4);
		private JTextField millisecs = new JTextField(4);
		private JLabel h = new JLabel("hours ");
		private JLabel m = new JLabel("mins");
		private JLabel s = new JLabel("secs");
		private JLabel ms = new JLabel("milliseconds");
		
		public intervalPane() {
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
		public String getHours() {
			return hours.getText();
		}
		public String getMins() {
			return mins.getText();
		}
		public String getSecs() {
			return secs.getText();
		}
		public String getMillisecs() {
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
	public class clickPane extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JLabel clickLabel = new JLabel("Click type: ");
		private JLabel xLabel = new JLabel("Mouse Button: ");
		private String[] choices1 = {"Single","Double"};
		private String[] choices2 = {"Left","Right"};
		private JComboBox<String> clickType = new JComboBox<String>(choices1);
		private JComboBox<String> xType = new JComboBox<String>(choices2);
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
		public String getType() {
			return (String) clickType.getSelectedItem();
		}
		public String getPlaceholder() {
			return (String) xType.getSelectedItem();
		}

	}
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
		}
	}
}
