import java.awt.*;

class Ex06_sub extends Frame{
	private Button bt1=new Button("1");
	private Button bt2=new Button("2");
	private Button bt3=new Button("3");
	private Button bt4=new Button("4");
	private Button bt5=new Button("5");
	
	private BorderLayout bl=new BorderLayout(10,10);
	
	public Ex06_sub(String title){
		super(title); // 객체는 어디에 ?
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
		this.setLayout(bl);
		this.add("North",bt1);
		this.add("South",bt2);
		this.add("West",bt3);
		this.add("East",bt4);
		this.add("Center",bt5);
			}
}

public class Ex06 {
	public static void main(String ar[]){
		Ex06_sub ex=new Ex06_sub("제목");
	}

}
