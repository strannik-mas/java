package su.strannik.ex3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex3 extends JFrame {
	private JButton MyButton = null;
	private Button exitButton = null;
	private JMenuBar menu = null;
	
	private JMenuBar getMenu() {
		if (menu == null) {
			menu = new JMenuBar();
			JMenu help = new JMenu("Справка");
			JMenuItem item1 = new JMenuItem("Выход");
			JMenuItem item2 = new JMenuItem("О программе");
			
			item2.setActionCommand("item2");	//чтобы отличать какой пункт нажат
			item2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("press");
					JDialog about = new JDialog(Ex3.this, "О программе");
					about.setVisible(true);
				}
			});
			
			help.add(item1);
			help.add(item2);
			menu.add(help);
		}
		return menu;
	}

	private JButton getMyButton() {
		if (MyButton == null) {
			MyButton = new JButton();
			MyButton.setText("JButton test");
			MyButton.setPreferredSize(new Dimension(34, 20));
			MyButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("actionPerformed()");
				}
			});
		}
		return MyButton;
	}

	private Button getExitButton() {
		if (exitButton == null) {
			exitButton = new Button();
			exitButton.setLabel("Exit");
			exitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return exitButton;
	}
	public static void main(String[] args) {
		Ex3 frame = new Ex3("Test AWT + Swing");
		frame.setVisible(true);
	}
	public Ex3(String title) {
		super(title);
		initialize();
	}
	private void initialize() {
		this.setSize(300, 200);
                this.setLocationByPlatform(true);
		this.add(getMyButton(), BorderLayout.NORTH);
		this.add(getExitButton(), BorderLayout.SOUTH);
		this.setJMenuBar(getMenu());
	}
}
