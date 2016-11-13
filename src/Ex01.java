import java.awt.*;
public class Ex01 {
	public static void main(String ar[]){
	Frame f=new Frame();
	Frame f1=new Frame("Á¦¸ñ");
	
	f.setSize(300, 200);
	f1.setSize(400,300);
	
	Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
	Dimension f_size=f.getSize();
	Dimension f1_size=f1.getSize();
	
	
	int xpos=(int)(screen.getWidth()/2-f_size.getWidth()/2);
	int ypos=(int)(screen.getHeight()/2-f_size.getHeight()/2);
	f.setLocation(xpos,ypos);
	
	int xpos1=(int)(screen.getWidth()/2-f1_size.getWidth()/2);
	int ypos1=(int)(screen.getHeight()/2-f1_size.getHeight()/2);
	f1.setLocation(xpos1,ypos1);
	
	f.setResizable(false);
	
	
	f.setVisible(true);
	f1.setVisible(true);
	
	
	
	}
}
