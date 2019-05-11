package com.kfc;

import javax.swing.JButton;
import javax.swing.JFrame;


import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;


public class Picture extends JFrame {
	ImageIcon icon = new ImageIcon();
	Image image = Toolkit.getDefaultToolkit().getImage("E:\\Users\\dell\\eclipse-workspace\\KFC\\src\\com\\kfc\\w.PNG");
	Picture() {// constructor
		this.setSize(450, 500);
		icon.setImage(image);
		JButton button = new JButton();
		button.setIcon(icon);

		this.getContentPane().add(button);
		this.setVisible(true);

	}
}
