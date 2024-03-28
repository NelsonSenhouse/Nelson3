import java.awt.*;
import javax.swing.*;

public class Enemy
{
    private ImageIcon img;
    private JLabel image;
    private String type;
    private int x;
    private int y;
    private int life;

    public Enemy()
    {
        img = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\alienenemy.gif");
        image = new JLabel("", img, JLabel.CENTER);
        x = Game.windowWidth + img.getIconWidth() * 2;
        y = (int) (Math.random() * (Game.windowHeight - getHeight()));
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
        type = "regular";
        life = 2;
    }

    public Enemy(String label)
    {
        img = new ImageIcon(label);
        image = new JLabel("", img, JLabel.CENTER);
        x = Game.windowWidth + img.getIconWidth() * 2;
        y = (int) (Math.random() * (Game.windowHeight - getHeight()));
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
        type = "miniboss";
        life = 5;
    }

    public void move()
    {
    }

    public void move(int speed)
    {
        x -= speed;
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
    }

    public void die()
    {
        ImageIcon explosion = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\explosion.gif");
        JLabel label = new JLabel("", explosion, JLabel.CENTER);
        label.setBounds(x, y, explosion.getIconWidth(), explosion.getIconHeight());
        label.setVisible(true);
        Game.background.add(label);
        x = Game.windowWidth + img.getIconWidth() * 2;
        y = (int) (Math.random() * (Game.windowHeight - getHeight()));
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
        reset(label);
    }

    public void reset(JLabel jl)
    {
        life = 2;
        Game.background.remove(jl);
    }

    public void damaged()
    {
        life--;
        if (life == 0)
        {
            die();
            Game.p1.updateScore();
        }
    }

    public JLabel getImage()
    {
        return image;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getWidth()
    {
        return img.getIconWidth();
    }

    public int getHeight()
    {
        return img.getIconHeight();
    }

    public String toString()
    {
        return type + "enemy";
    }

    public boolean equals(Enemy other)
    {
        return this.type.equals(other.type);
    }
}
