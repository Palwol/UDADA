import javax.swing.*;

public class MyFrame1 extends JFrame{
	public MyFrame1() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label = new JLabel("�ڹٴ� ����ֳ���?");
		JButton button1 = new JButton("Yes");
		JButton button2 = new JButton("No");
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		
		setSize(300,150);
		setTitle("My Frame1");
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();

	}

}
