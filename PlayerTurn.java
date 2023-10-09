import javax.swing.*;

public class PlayerTurn extends JPanel {
	private static final long serialVersionUID = 1L;
	public JLabel playerTurn = new JLabel("Unknown");

    public PlayerTurn() {
        JLabel turn = new JLabel("Current turn:");
        add (turn);
        add(playerTurn);
    }

    void updateTurn(String playerName) {
        playerTurn.setText(playerName);
    }
}