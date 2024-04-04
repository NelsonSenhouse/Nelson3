public class Miniboss extends Enemy
{
    private int speed = 2;
    public Miniboss()
    {
        super("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\miniboss.gif");
    }

    public void move()
    {
        super.move(speed);
    }

    public String toString()
    {
        return "This miniboss has " + speed + " speed";
    }

    public boolean equals(Miniboss other)
    {
        return this.speed == other.speed;
    }
}
