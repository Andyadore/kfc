package com.kfc;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Applettext extends Applet implements ActionListener {
	Button btn;
	Image myImage;

	public void init() {

		btn = new Button("关闭");
		myImage = getImage(getDocumentBase(), "com.kfc\\q.jpg");// 获得该图像文件

		add(btn);
		btn.addActionListener(this);
	}

	public void paint(Graphics g) {
		g.drawImage(myImage, 0, 0, 300, 200, this);// 绘出图形文件
		g.drawString("hello", 20, 30);
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
