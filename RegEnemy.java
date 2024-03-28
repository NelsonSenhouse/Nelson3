public class RegEnemy extends Enemy
{
    private int speed = 4;
    public RegEnemy()
    {
        super();
    }

    public void move()
    {
        super.move(speed);
    }

    public String toString()
    {
        return "This regular enemy has " + speed + "speed";
    }

    public boolean equals(RegEnemy other)
    {
        return this.speed == other.speed;
    }
}
