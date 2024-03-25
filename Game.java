import javax.swing.*;

public class Game extends JFrame
{
    public static JLabel background;
    public static ImageIcon bg = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\space.gif");
    public static int windowWidth = bg.getIconWidth();
    public static int windowHeight = bg.getIconHeight();
    public Game()
    {
        setSize(windowWidth, windowHeight - 50);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        background = new JLabel("", bg, JLabel.CENTER);
        background.setBounds(0, 0, windowWidth, windowHeight - 50);
        Player p1 = new Player();
        add(p1.getImage());
        add(new Enemy().getImage());
        add(background);
        for (int i = 0; i <= 4; i++)
        {
            p1.move();
        }
        setVisible(true);
    }
}
