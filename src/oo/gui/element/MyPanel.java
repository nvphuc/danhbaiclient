package oo.gui.element;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	Image image;
	
	public MyPanel(String nameImage) {
		image = (new ImageIcon("images/" + nameImage + ".png")).getImage();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		setOpaque(false);
		super.paintComponent(g);
		setOpaque(true);
	}
}