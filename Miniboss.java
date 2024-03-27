public class Miniboss extends Enemy
{
    private int speed = 2;
    public Miniboss()
    {
        super("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\miniboss.png");
    }

    public void move()
    {
        super.move(speed);
    }
}
