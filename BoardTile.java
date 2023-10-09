import java.awt.*;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class BoardTile extends JButton {
    
	private static final long serialVersionUID = 1L;
	Font font     = new Font("Ariel", Font.PLAIN, 24);
    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
    Color bgLight = new Color(255, 255, 255);
    Color bgDark  = new Color(220, 220, 220);

    BoardTile(String s) {
        super(s);
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        // setBackground(bgLight);
        g.drawRect(0, 0, getWidth(), getHeight());
        g.setColor(bgLight);
        setFont(font);
        setHorizontalAlignment( SwingConstants.CENTER );
    }
}