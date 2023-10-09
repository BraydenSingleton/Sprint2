import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Users  extends JPanel implements ActionListener {
    
	private static final long serialVersionUID = 1L;
	private ButtonGroup group = new ButtonGroup();
	public String choice;
	private JLabel name;
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ACTION: Updated user option " + choice);
        choice = group.getSelection().getActionCommand();
    }
    
    public Users(String player) {
        setAlignmentY(Component.CENTER_ALIGNMENT);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(new EmptyBorder(40, 10, 0, 10));
        
        name = new JLabel(player);
        name.setOpaque(true);
        add(name);

        JRadioButton opt1 = new JRadioButton("S");
        opt1.setActionCommand("S");
        opt1.setSelected(true);
        choice = "S";
        add(opt1);
        
        JRadioButton opt2 = new JRadioButton("O");
        opt2.setActionCommand("O");
        add(opt2);

        group.add(opt1);
        group.add(opt2);

    }

    public String getSelectedOption() {
        System.out.println("current user option " + group.getSelection().getActionCommand());
        return group.getSelection().getActionCommand();
    }

    public String getUser() {
        return name.getText();
    }
}