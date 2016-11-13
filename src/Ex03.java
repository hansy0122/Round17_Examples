import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.*;

class Ex03_sub extends Frame{
	private Label lb=new Label("ÇÑ½Â¿±");
	
	public Ex03_sub(String title){
		super(title); // °´Ã¼´Â ¾îµð¿¡ ?
		
		
		this.init();
		
		super.setSize(300,200);

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
	}
	public void init(){
		super.add(lb);
	}
	
}

public class Ex03 {
	public static void main(String ar[]){
		Ex03_sub ex=new Ex03_sub("Á¦¸ñ");
	}

}

