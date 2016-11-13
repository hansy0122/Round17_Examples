import java.awt.*;

class Ex02_sub extends Frame{
	public Ex02_sub(String title){
		super(title); // 객체는 어디에 ?
		super.setSize(300,200); // this로 해도 무방 --> 이름이 같은 메소드가 없으면 하위 class 부터 찾지만 상위 클래스로 올라가서 method 를 찾아주기 때문

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
		Ex02_sub ex=new Ex02_sub("제목");
	}

}
