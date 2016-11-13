import java.awt.*;
class Ex04_sub extends Frame{
	private Button bt1=new Button("1");
	private Button bt2=new Button("2");
	private Button bt3=new Button("3");
	private Button bt4=new Button("4");
	private Button bt5=new Button("5");
	private Button bt6=new Button("6");
	
	private FlowLayout f1=new FlowLayout();
	
	public Ex04_sub(String title){
		super(title); // 객체는 어디에 ?
		
		init();
		
		super.setSize(300,200);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		//super.setResizable(false);
		super.setVisible(true);
	}
	
	
	public void init(){
		this.setLayout(f1);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
	}
}

public class Ex04 {
	public static void main(String ar[]){
		Ex04_sub ex=new Ex04_sub("제목");
	}

}
