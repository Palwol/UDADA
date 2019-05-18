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
			output.setText("인간과 컴퓨터가 비겼음");
		else if(user == (computer+1)%3)
			output.setText("인간: "+user+" 컴퓨터: "+computer+" 인간승리");
		else
			output.setText("인간: "+user+" 컴퓨터: "+computer+" 컴퓨터승리");
	}
	
	public RockPaperScissors() {
		setTitle("가위, 바위, 보");
		setSize(400, 150);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
		output = new JLabel("good Luck!");
		
		scissors = new JButton("0: 가위");
		rock = new JButton("1: 바위");
		paper = new JButton("2: 보");
		
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
