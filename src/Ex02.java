import java.awt.*;

class Ex02_sub extends Frame{
	public Ex02_sub(String title){
		super(title); // ��ü�� ��� ?
		super.setSize(300,200); // this�� �ص� ���� --> �̸��� ���� �޼ҵ尡 ������ ���� class ���� ã���� ���� Ŭ������ �ö󰡼� method �� ã���ֱ� ����

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
	}
}

public class Ex02 {
	public static void main(String ar[]){
		Ex02_sub ex=new Ex02_sub("����");
	}

}