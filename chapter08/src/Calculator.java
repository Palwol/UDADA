import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	
	private String[] labels = {
			"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6",
			"x", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="};
	
	public Calculator() {
		JPanel panel = new JPanel();
		add(panel);
		JTextField field = new JTextField(600);
		add(field, BorderLayout.NORTH);
		
		panel.setLayout(new GridLayout(0,5,3,3));
		JButton[] buttons = new JButton[25];
		int index = 0;
		for(int rows=0; rows<5; rows++) {
			for(int cols=0; cols<5; cols++) {
				buttons[index] = new JButton(labels[index]);
				buttons[index].setBackground(Color.yellow);
				if(cols <= 3)
					buttons[index].setForeground(Color.blue);
				else
					buttons[index].setForeground(Color.red);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		setSize(600,200);
		setTitle("Calculator");
		setVisible(true);
	}


	public static void main(String[] args) {
		Calculator f = new Calculator();

	}

}
