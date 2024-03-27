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
}
