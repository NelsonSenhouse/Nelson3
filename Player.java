import javax.swing.*;

public class Player
{
    private ImageIcon img = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\ship.png");
    private JLabel image;
    private int score;
    private int x;
    private int y = Game.windowHeight / 2;
    public Player()
    {
        image = new JLabel("", img, JLabel.CENTER);
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
    }
    public void move()
    {
        y += 10;
        image.setBounds(x, y, img.getIconWidth(), img.getIconHeight());
        image.setVisible(true);
    }
    public JLabel getImage()
    {
        return image;
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
