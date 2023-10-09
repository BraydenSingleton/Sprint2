import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Board extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	public String sChar = "\u0053";
    public String oChar = "\u004F";
    public String emptyChar = " ";

    public Users u1;
    public Users u2;
    public Users currentPlayer;
    public PlayerTurn cT;
    public JButton boardTileButtons [][];
    private Integer boardSize;
    
    //Making a move on board
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int row=0; row < boardSize; row++) {
            for (int col=0; col < boardSize; col++) {
                if (e.getSource() == boardTileButtons[row][col]) {
                    boardTileButtons[row][col].setText(currentPlayer.getSelectedOption());
                }
            }
        }
        nextPlayer();
    }

    public Board(Integer size, Users user1, Users user2, PlayerTurn playerTurn) {
        boardSize = size;
        boardTileButtons = new BoardTile [boardSize][boardSize];

        u1 = user1;
        u2 = user2;
        currentPlayer = u1; // Default player to start
        cT = playerTurn;
        cT.updateTurn(currentPlayer.getUser());

         GridLayout gridLayout = new GridLayout(boardSize, boardSize, 0, 0);
        setLayout(gridLayout);
            
        //make board function
        for (int row=0; row < boardSize; row++) {
            for (int col=0; col < boardSize; col++) {
                JButton tiles = new BoardTile(emptyChar);
                boardTileButtons[row][col] = tiles;
                boardTileButtons[row][col].addActionListener(this);
                add(tiles);
            }
        }
    }

    void nextPlayer() {
        currentPlayer = currentPlayer == u1 ? u2 : u1;
        cT.updateTurn(currentPlayer.getUser());
    }

}