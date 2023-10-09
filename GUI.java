import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI{
		
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("SOS");
		JPanel panel = new JPanel();
		frame.setSize(800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		frame.setLayout(new BorderLayout());
				
		Users user1 = new Users("Blue Player");
		Users user2 = new Users("Red Player");
		PlayerTurn playerturn = new PlayerTurn();
		
		Board board = new Board(9,user1, user2, playerturn);
		
		
		frame.add(user1, BorderLayout.WEST);
		frame.add(user2, BorderLayout.EAST);
		frame.add(new GameMode(), BorderLayout.NORTH);
		frame.add(board, BorderLayout.CENTER);
		frame.add(playerturn, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
		/*JCheckBox box = new JCheckBox("Record Game");
		box.setBounds(10,900,110,25);
		panel.add(box);
		JRadioButton button1 = new JRadioButton("Human"); 
		JRadioButton button2 = new JRadioButton("Computer");
		JRadioButton button3 = new JRadioButton("Human");
		JRadioButton button4 = new JRadioButton("Computer");
		JRadioButton button5 = new JRadioButton("Simple Game");
		JRadioButton button6 = new JRadioButton("General Game");
		JRadioButton button7 = new JRadioButton("S");
		JRadioButton button8 = new JRadioButton("O");
		JRadioButton button9 = new JRadioButton("S");
		JRadioButton button10 = new JRadioButton("O");
		button1.setBounds(30,95,80,25);
		button2.setBounds(30, 125, 100, 25);
		button3.setBounds(830, 95, 80, 25);
		button4.setBounds(830, 125, 100, 25);
		button5.setBounds(50, 10, 115, 25);
		button6.setBounds(165,10,125,25);
		button7.setBounds(50,150,125,25);
		button8.setBounds(50,175,125,25);
		button9.setBounds(850,150,125,25);
		button10.setBounds(850,175,125,25);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		button4.setVisible(true);
		button5.setVisible(true);
		button6.setVisible(true);
		button7.setVisible(true);
		button8.setVisible(true);
		button9.setVisible(true);
		button10.setVisible(true);
		*/
		
	}
}