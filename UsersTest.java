import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javax.swing.JRadioButton;

/**
 * The test class UsersTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UsersTest
{
     private Users user;

    @Before
    void setUp() {
        user = new Users("Player1");
    }

    @Test
    void testUserInitialization() {
        assertNotNull(user);
        assertEquals("Player1", user.getUser());
        assertEquals("S", user.getSelectedOption());
    }

    @Test
    void testOptionSelection() {
        assertEquals("S", user.getSelectedOption());

        JRadioButton radioButtonO = new JRadioButton("O");
        radioButtonO.setActionCommand("O");
        radioButtonO.setSelected(true);
        user.actionPerformed(null); // Simulate a button click

        assertEquals("O", user.getSelectedOption());
    }

    @Test
    void testUserChangeName() {
        assertEquals("Player1", user.getUser());

        user = new Users("Player2");
        assertEquals("Player2", user.getUser());
    }
}
