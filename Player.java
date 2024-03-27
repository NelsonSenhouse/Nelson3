import javax.swing.*;

public class Player
{
    private ImageIcon img = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\ship.png");
    private JLabel image;
    private int score;
    private int x;
    private int y = Game.windowHeight / 2;
    private int life = 3;

    public Player()
    {
        image = new JLabel("", img, JLabel.CENTER);
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
    }
    public void move(String dir)
    {
        if (dir.equals("down"))
        {
            if (y < Game.windowHeight - img.getIconHeight())
            {
                y += 10;
            }
        }
        else if (dir.equals("up"))
        {
            if (y > 0)
            {
                y -= 10;
            }
        }
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
    }

    public Laser shoot()
    {
        Laser laser = new Laser(x + img.getIconWidth() - 30, y + img.getIconHeight() / 2 - 10);
        Game.background.add(laser.getImage());
//        laser.move();
        return laser;
    }

    public void updateScore()
    {
        score++;
    }

    public int getScore()
    {
        return score;
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
        return "This player has " + score + " points";
    }

    public boolean equals(Player other)
    {
        return this.score == other.score;
    }
}
