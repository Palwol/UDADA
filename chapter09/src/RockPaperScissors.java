import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class RockPaperScissors extends JFrame implements ActionListener{
	final int SCISSORS = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	private JPanel panel;
	private JLabel information, output;
	private JButton rock, paper, scissors;
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		int user = Integer.parseInt(""+b.getText().charAt(0));
		
		Random random = new Random();
		int computer = random.nextInt(3);
		
		if(user == computer)
			output.setText("�ΰ��� ��ǻ�Ͱ� �����");
		else if(user == (computer+1)%3)
			output.setText("�ΰ�: "+user+" ��ǻ��: "+computer+" �ΰ��¸�");
		else
			output.setText("�ΰ�: "+user+" ��ǻ��: "+computer+" ��ǻ�ͽ¸�");
	}
	
	public RockPaperScissors() {
		setTitle("����, ����, ��");
		setSize(400, 150);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		information = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�!");
		output = new JLabel("good Luck!");
		
		scissors = new JButton("0: ����");
		rock = new JButton("1: ����");
		paper = new JButton("2: ��");
		
		scissors.addActionListener(this);
		rock.addActionListener(this);
		paper.addActionListener(this);
		
		panel.add(scissors);
		panel.add(rock);
		panel.add(paper);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		RockPaperScissors gui = new RockPaperScissors();

	}

}
