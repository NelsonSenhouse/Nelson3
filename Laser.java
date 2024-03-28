import javax.swing.*;

public class Laser
{
    private ImageIcon img = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\laser.png");
//    private ImageIcon img = new ImageIcon("laser.png");
    private JLabel image;
    private int x;
    private int y;
    private boolean collide;

    public Laser(int x, int y)
    {
        this.x = x;
        this.y = y;
        image = new JLabel("", img, JLabel.CENTER);
        image.setBounds(this.x, this.y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
    }

    public void move()
    {
        if (x < Game.windowWidth - img.getIconWidth() * 2 && !collide)
        {
            x += 15;
            image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
            image.setVisible(true);
        }
        else
        {
            y = -100;
            image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
            image.setVisible(false);
            collide = false;
        }
    }

    public void move(String w)
    {
        if (x > 0)
        {
            x -= 15;
            image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
            image.setVisible(true);
        }
        else
        {
            y = -100;
            image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
            image.setVisible(false);
        }
    }

    public Enemy collided()
    {
        for (Enemy[] row : Game.enemies)
        {
            for (int i = 0; i < row.length; i++)
            {
                if ((row[i].getX() < x && x < row[i].getX() + row[i].getWidth()) && (row[i].getY() < y && y < row[i].getY() + row[i].getHeight()))
                {
                    collide = true;
                    return row[i];
                }
            }
        }
        return null;
    }

    public boolean getCollide()
    {
        return collide;
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

    public String toString()
    {
        if (collide) return "This laser has collided";
        else return "This laser is still moving";
    }

    public boolean equals(Laser other)
    {
        return this.collide == other.collide;
    }
}
