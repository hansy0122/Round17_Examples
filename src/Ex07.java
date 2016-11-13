import java.awt.*;

class Ex07_sub extends Frame{
	private Button bt1=new Button("1");
	private Button bt2=new Button("2");
	private Button bt3=new Button("3");
	
	private CardLayout cl=new CardLayout();
	public Ex07_sub(String title){
		super(title); // ��ü�� ��� ?
		super.setSize(300,200);
		this.init();

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			
		}
		cl.show(this, "bb");
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			
		}
		cl.show(this, "cc");
		
		
	}
	public void init(){
		this.setLayout(cl);
		this.add("aa",bt1); // aa ,bb, cc�� �̸�
		this.add("bb",bt2);
		this.add("cc",bt3);
	}
}

public class Ex07 {
	public static void main(String ar[]){
		Ex07_sub ex=new Ex07_sub("����");
	}

}
