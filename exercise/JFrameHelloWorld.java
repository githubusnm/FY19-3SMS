import javax.swing.*;

public class JFrameHelloWorld{
	public static void main(String args[]){
		JFrame frame = new JFrame("JFrame��ʾ");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello world");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}