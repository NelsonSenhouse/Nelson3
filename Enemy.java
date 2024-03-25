import java.awt.*;
import javax.swing.*;

public class Enemy
{
    private JLabel image;
    public Enemy()
    {
        ImageIcon img = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\enemy.png");
        image = new JLabel("", img, JLabel.CENTER);
        image.setBounds(Game.windowWidth + img.getIconWidth(), Game.windowHeight / 2, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
    }
    public JLabel getImage()
    {
        return image;
    }
}
