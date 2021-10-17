import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener{
	
	

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 1000);
//		rings(50,50, 100, g);
//		squares(300, 300, 100, g);
//		donut(130, 120, 0, 150, g);
		clover(465, 255, 10, g);
		clover1(455, 265, 10, g);
		clover2(465, 265, 10, g);
		clover3(455, 255, 10, g);
		
	
	}
	
	
/*	public void rings(int x, int y, int width, Graphics g) {
		
		if(width>10) {
			
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, width, width);
			
			rings(x+5,y+5, width-10, g);
			
		}
		
	} */
	
	public void concentricSquares(int x, int y, int width, Graphics g) {
		g.setColor(Color.blue);
				
	}
	
	public void clover(int x, int y, int width, Graphics g) {
		
		if ( width < 150 ) {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, width, width);
			
			clover(x, y-5, width+5, g);
		}
		
				
	}
	
	public void clover1(int x, int y, int width, Graphics g) {
		if ( width < 150 ) {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, width, width);
			
			clover1(x-5, y, width+5, g);
		}
	}
	
	public void clover2(int x, int y, int width, Graphics g) {
		if ( width < 150 ) {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, width, width);
			
			clover2(x, y, width+5, g);
		}
	}
	
	public void clover3(int x, int y, int width, Graphics g) {
		if ( width < 150 ) {
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, width, width);
			
			clover3(x-5, y-5, width+5, g);
		}
	}
	
	public void snowFlake(int len, int x1, int y1, int x2, int y2, Graphics g) {
		
	}
	
	
/*	public void squares(int x, int y, int width, Graphics g) {
		if (width > 3) {
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		g.setColor(new Color(red, green, blue));
		
		//draws one square
		g.fillRect(x, y, width, width);	
		
		squares(x+width/3, y+width+width/3, width/3, g);
		squares(x+width+width/3, y+width+width/3, width/3, g);
		squares(x-width+width/3, y-width+width/3, width/3, g);
		squares(x+width+width/3, y-width+width/3, width/3, g);
		squares(x-width+width/3, y+width+width/3, width/3, g);
		
		}

	} */
	
/*	public void donut(int x, int y, int angle, int width, Graphics g) {
		
		if (angle < 360) {
			
	//	int red = (int)(Math.random()*256);
	//	int green = (int)(Math.random()*256);
	//	int blue = (int)(Math.random()*256);
		
	//	g.setColor(new Color(red, green, blue));
			
		g.setColor(Color.blue);
		g.drawOval(x,  y,  width, width);
		x += (int)((width/2)*Math.cos(angle));
		y += (int)((width/2)*Math.sin(angle));
		donut(x, y, angle + 1, width, g);
		
		}
	} */
	
	public void spiral(int x, int y, int angle, int width, Graphics g) {
		
	}
	
	public void binTree(int x1,  int y1, int x2, int y2, int len, Graphics g) {
       	
	}
	
	
	
	
	public static void main(String[] arg) {
		
		//find a way to run the constructor of the Driver class
		Driver d  = new Driver(); //will this invoke a constructor?
		

	}	
	
	//1) add a Driver constructor
		public Driver() {
			JFrame frame = new JFrame("ArrayList stuff");
			frame.setSize(800,600);
			frame.add(this);
			
			//this part makes sure the x button closes the program
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//t.start();
			//make the frame show up
			frame.setVisible(true);
					
		}
	Timer t = new Timer(1000, this);
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}



