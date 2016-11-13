import java.awt.*;

class Ex08_sub extends Frame{
	
	private Button bt1=new Button("AAA");
	private Button bt2=new Button("BBB");
	private Button bt3=new Button("CCC");
	private Button bt4=new Button("DDD");
	private Button bt5=new Button("EEE");
	private Button bt6=new Button("FFF");
	private Button bt7=new Button("GGG");
	
	private GridBagLayout gb=new GridBagLayout();	
	private GridBagConstraints gc=new GridBagConstraints();
	
	
	public Ex08_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200);
		this.init();

		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=super.getSize();
		
		
		int xpos=(int)(screen.getWidth()/2-frm.getWidth()/2);
		int ypos=(int)(screen.getHeight()/2-frm.getHeight()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		

	}
	
	public void init(){
		this.setLayout(gb);
		gc.gridx=0;
		gc.gridy=0;
		gb.setConstraints(bt1, gc);
		this.add(bt1);
		
		gc.gridx=1;
		gc.gridy=1;
		gb.setConstraints(bt2, gc);
		this.add(bt2);
		
		gc.gridx=2;
		gc.gridy=2;
		gb.setConstraints(bt3, gc);
		this.add(bt3);
		
		gc.gridx=3;
		gc.gridy=2;
		gb.setConstraints(bt5, gc);
		this.add(bt5);
		
		gc.gridx=2;
		gc.gridy=0;
		gc.gridwidth=2;
		gc.gridheight=2;
		gb.setConstraints(bt4, gc);
		this.add(bt4);
	}
}

public class Ex08 {
	public static void main(String ar[]){
		Ex08_sub ex=new Ex08_sub("제목");
	}

}
