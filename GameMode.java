import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameMode extends JPanel implements ActionListener, KeyListener{
	private static final long serialVersionUID = 1L;
	JTextField boardSize = new JTextField("9", 3);

    @Override
    public void keyPressed(KeyEvent key) {
        Integer newBoardSize;
        if (key.getKeyCode()==KeyEvent.VK_ENTER) {
            System.out.println("Enter: The value is " + boardSize.getText());
            // System.out.println("Enter: The value is " + boardSize.getKeyChar());
            try {
                newBoardSize = Integer.valueOf(boardSize.getText());
                if (Integer.valueOf(boardSize.getText()) < 2) {
                    JOptionPane.showMessageDialog(null , "Board size cannot be less than 2 as you need to complete 3 in a row to score");
                } else {
                    JOptionPane.showMessageDialog(null , "Starting a new game with board size " + newBoardSize.toString());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null , "Please enter a number.");
            }
          } 
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public GameMode() {
        GridBagConstraints gridLayout = new GridBagConstraints();
        gridLayout.gridwidth = GridBagConstraints.REMAINDER;
        gridLayout.fill = GridBagConstraints.HORIZONTAL;

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton optionOneBtn = new JRadioButton("Simple Game");
        buttonGroup.add(optionOneBtn);
        add(optionOneBtn, gridLayout);
        optionOneBtn.setSelected(true);

        JRadioButton optionTwoBtn = new JRadioButton("General Game");
        buttonGroup.add(optionTwoBtn);
        add(optionTwoBtn, gridLayout);

        add(Box.createHorizontalStrut(150));

        JLabel playerName = new JLabel("Board size:");
        add(playerName);
        add(boardSize);
    }    
}