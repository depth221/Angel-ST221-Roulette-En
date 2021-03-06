package classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	
	String ProjectName = "Roulette-En";
	int Size1 = 752;
	int Size2 = 423;
	String or16 = "16:9";
	String Fonts = "Ghodic";
	int FontEvent = Font.PLAIN;
	int FontSize = 32;
	Font FontBasic = new Font(Fonts, FontEvent, FontSize);
	Dimension comscreen =Toolkit.getDefaultToolkit().getScreenSize(); //모니터 해상도 추출, http://sugame.tistory.com/618, https://archive.is/EDdKj

	GUI(String title) {
		
		super(title);
		
		System.out.println(ProjectName + "을 시작합니다.");
		System.out.println("모니터 해상도: " + comscreen.width + "x" + comscreen.height);
		System.out.println("화면 크기: " + Size1 + "x" + Size2 + "(화면 비율: " + or16 + ")");
		
		if (FontEvent == Font.PLAIN) {
			System.out.println("글꼴: " + Fonts + ", 크기: " + FontSize + ", 효과 없음");
			
		} else if (FontEvent == Font.BOLD) {
			System.out.println("글꼴: " + Fonts + ", 크기: " + FontSize + ", 글씨 굵게");
			
		} else if (FontEvent == Font.ITALIC) {
			System.out.println("글꼴: " + Fonts + ", 크기: " + FontSize + ", 글씨 기울어지게");
			
		}
		
		setLayout(new FlowLayout());
		
		JButton LabelSideL = new JButton("반 다크홈");
		LabelSideL.setFont(FontBasic);
		//LabelSideL.setSize(141, 423);
		//LabelSideL.setLocation(0, 0);
		add(LabelSideL);
		
		JButton LabelMain = new JButton("반 다크홈");
		LabelMain.setFont(FontBasic);
		//LabelMain.setSize(470, 423);
		//LabelMain.setLocation(141, 0);
		add(LabelMain);
		
		JButton LabelSideR = new JButton("반 다크홈");
		LabelSideR.setFont(FontBasic);
		//LabelSideR.setSize(141, 423);
		//LabelSideR.setLocation(611, 0);
		add(LabelSideR);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Size1, Size2);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI app = new GUI("Test");

	}

}