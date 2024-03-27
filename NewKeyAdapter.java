import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NewKeyAdapter extends KeyAdapter
{
    public static String direction = "z";
    public static int shoot = 0;

    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_S)
        {
            direction = "down";
        }
        else if (e.getKeyCode() == KeyEvent.VK_W)
        {
            direction = "up";
        }
        else if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            shoot++;
        }
    }
}
