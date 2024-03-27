import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Game extends JFrame implements ActionListener
{
    public static JLabel background;
    public static ImageIcon bg = new ImageIcon("C:\\Users\\nsenh\\IdeaProjects\\MP3 Project\\src\\space.gif");
    public static int windowWidth = bg.getIconWidth();
    public static int windowHeight = bg.getIconHeight() - 50;
    public static Player p1 = new Player();
    public static ArrayList<Laser> playersLasers = new ArrayList<>();
    public static int plIndx = -1;
    public static ArrayList<Laser> enemyLasers = new ArrayList<>();
    public static int elIndx = -1;
    public static Enemy re1 = new RegEnemy();
    public static Miniboss mb1 = new Miniboss();
    public static Enemy[][] enemies = {{re1, new RegEnemy(), new RegEnemy(), new RegEnemy(), new RegEnemy()},
                                        {mb1, new Miniboss(), new Miniboss()}};
    public static int eIndx1 = 0;
    public static int eIndx2 = 0;
    private int delay = 30;
    private int prev = NewKeyAdapter.shoot;
    private Timer timer;
    private int time;
    private boolean running = true;
    int hits = 0;

    public Game()
    {
        setSize(windowWidth, windowHeight);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(new NewKeyAdapter());
        background = new JLabel("", bg, JLabel.CENTER);
        background.setBounds(0, 0, windowWidth, windowHeight);
        add(background);
//        JLabel scoreLabel = new JLabel("Score");
//        scoreLabel.setBounds(0, 0, 100, 100);
//        add(scoreLabel);
        setVisible(true);
        start();
    }

    public void start()
    {
//        background.add(re1.getImage());
        background.add(p1.getImage());
        timer = new Timer(delay, this);
        timer.start();
    }

    public void createEnemies()
    {
        if (time > 0)
        {
//            if (time % 3000 == 0 && eIndx1 < enemies[0].length) {
//                background.add(enemies[0][eIndx1].getImage());
//                eIndx1++;
//                System.out.println(("new reg"));
//            }

            if (time % 5000 == 0 && eIndx2 < enemies[1].length)
            {
                background.add(enemies[1][eIndx2].getImage());
                eIndx2++;
                System.out.println("new mini");
            }
        }
    }

    public void moveEnemies()
    {
        for(int i = 0; i < eIndx1; i++)
        {
            enemies[0][i].move();
        }
        for (int i = 0; i < eIndx2; i++)
        {
            enemies[1][i].move();
        }
    }

    public void playerShoot()
    {
        if (NewKeyAdapter.shoot == prev + 1)
        {
            if (playersLasers.add(p1.shoot()))
            {
                System.out.println("You shot a laser!");
            }
            plIndx++;
            prev = NewKeyAdapter.shoot;
        }
        if (plIndx > -1)
        {
            for (int i = 0; i < playersLasers.size(); i++)
            {
                playersLasers.get(i).move();
            }
        }
    }

    public void enemyShoot()
    {
        if (time % 3000 == 0 && eIndx2 > 0)
        {
            for (int i = 0; i < eIndx2; i++)
            {
                Laser l = new Laser(enemies[1][i].getX(), enemies[1][i].getY() + enemies[1][i].getHeight() / 2);
                background.add(l.getImage());
                enemyLasers.add(0, l);
                elIndx++;
            }
        }
        for (Laser l : enemyLasers)
        {
            l.move("enemy");
        }
    }

    public void checkIfHit()
    {
        for (int i = 0; i < plIndx; i++)
        {
            for (Enemy[] row : enemies)
            {
                for (int j = 0; j < row.length; j++)
                {
                    if (playersLasers.get(i).collided(row[j]))
                    {
                        row[j].damaged();
                    }
                }
            }
        }
        if (re1.getX() < p1.getX() + p1.getWidth() / 2) running = false;

    }

    public void actionPerformed(ActionEvent e)
    {
        if (running)
        {
            time += delay;
            System.out.println(time);
            p1.move(NewKeyAdapter.direction);
            playerShoot();
            enemyShoot();
//            System.out.println(hits);
            checkIfHit();
            createEnemies();
            moveEnemies();
//            re1.move();
        }
    }
}
