//prototype
package autoclicker_v1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class gui_v1 extends javax.swing.JFrame implements ActionListener{
	private JPanel interval_panel = new JPanel();
	private JPanel click_panel = new JPanel();
	private JPanel repeat_panel = new JPanel();
	private JPanel location_panel = new JPanel();
	private JPanel start_panel = new JPanel();
	private JLabel l = new JLabel("Test");
	private JLabel m = new JLabel("Fatt");
	private JLabel k = new JLabel("testvaaving");
	public gui_v1() {
		setResizable(false);
		interval_panel.setBackground(Color.green);
		click_panel.setBackground(Color.red);
		repeat_panel.setBackground(Color.blue);
		location_panel.setBackground(Color.yellow);
		start_panel.setBackground(Color.orange);
		
		interval_panel.add(k);
		click_panel.add(l);
		setPreferredSize(new Dimension(300,225));
		GridLayout gridLayout = new GridLayout (2,2);
		JPanel middlePanel = new JPanel(gridLayout);
		middlePanel.add(click_panel);
		middlePanel.add(repeat_panel);
		middlePanel.add(location_panel);
		
		add(interval_panel,BorderLayout.NORTH);
		add(middlePanel, BorderLayout.CENTER);
		add(start_panel,BorderLayout.SOUTH);
//		interval_panel.add(l);
//		click_panel.add(k);
//		repeat_panel.add(m);
//		location_panel.add(l);
//		start_panel.add(k);
//		
//		add(interval_panel);
//		add(click_panel);
//		add(repeat_panel);
//		add(location_panel);
//		add(start_panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new gui_v1().setVisible(true);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
