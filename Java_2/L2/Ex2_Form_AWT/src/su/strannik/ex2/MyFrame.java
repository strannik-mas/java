package su.strannik.ex2;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class MyFrame extends Frame implements MouseListener, MouseMotionListener{

	int pointX, pointY;
	LinkedList<Line> list = new LinkedList<Line>();
	
	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public MyFrame(String title) throws HeadlessException {
		super(title);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println(e.toString());
				System.out.println(Thread.currentThread().getName());
				System.exit(0);
			}
		});
		
		this.add("West", new Button("OK"));
		this.add("South", new Button("Test"));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(Line li : list) li.draw(g);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
//		System.out.println(e.getX() + " " + e.getY());
		int newX = e.getX();
		int newY = e.getY();
		this.getGraphics().drawLine(this.pointX, this.pointY, newX, newY);
		list.add(new Line(this.pointX, this.pointY, newX, newY));
		//если не переприсвоить, то будут концентрические линии
		this.pointX = newX;
		this.pointY = newY;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.pointX = e.getX();
		pointY = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
