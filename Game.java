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
    private int delay = 20;
    private int prev = NewKeyAdapter.shoot;
    private Timer timer;
    public static int time;
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
            if (time % 3000 == 0 && eIndx1 < enemies[0].length) {
                background.add(enemies[0][eIndx1].getImage());
                eIndx1++;
                System.out.println(("new reg"));
            }

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
        for (int i = 0; i < playersLasers.size(); i++)
        {
            playersLasers.get(i).move();
        }
    }

    public void enemyShoot()
    {
        if (time % 3000 == 0 && eIndx2 > 0)
        {
            for (int i = 0; i < eIndx2; i++)
            {
                Laser l = new Laser(enemies[1][i].getX(), enemies[1][i].getY() + enemies[1][i].getHeight() / 2 - 10);
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
//        for (int i = 0; i < plIndx; i++)
//        {
//            for (Enemy[] row : enemies)
//            {
//                for (int j = 0; j < row.length; j++)
//                {
//                    if (playersLasers.get(i).collided(row[j]))
//                    {
//                        row[j].damaged();
//                        System.out.println("damaged");
//                        p1.takeDamage();
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < enemies.length; i++)
//        {
//            for (int j = 0; j < enemies[i].length; j++)
//            {
//                for (int k = 0; k < playersLasers.size(); k++)
//                {
//                    playersLasers.get(k).collided(enemies[i][j]);
//                    if (playersLasers.get(k).getCollide())
//                    {
//                        enemies[i][j].damaged();
//                        System.out.println("damaged");
//                    }
//                }
//                if (enemies[i][j].getX() < p1.getWidth() / 2) running = false;
//            }
//        }
        for (int i = 0; i < playersLasers.size(); i++)
        {
            if (playersLasers.get(i).collided() != null) playersLasers.get(i).collided().damaged();
        }
        for (int i = 0; i < enemyLasers.size(); i++)
        {
            if ((p1.getX() < enemyLasers.get(i).getX() && enemyLasers.get(i).getX() < p1.getX() + p1.getWidth()) &&
                    (p1.getY() < enemyLasers.get(i).getY() && enemyLasers.get(i).getY() < p1.getY() + p1.getHeight()))
            {
                p1.takeDamage();

            }
        }
        if(p1.getDead())
        {
            running = false;
        }
//        if (re1.getX() < p1.getX() + p1.getWidth() / 2) running = false;

    }

    public void actionPerformed(ActionEvent e)
    {
        if (running)
        {
            time += delay;
            p1.move(NewKeyAdapter.direction);
            playerShoot();
            enemyShoot();
//            System.out.println(hits);
            checkIfHit();
            createEnemies();
            moveEnemies();
//            re1.move();
        }
        else
        {
            background.remove(p1.getImage());
            for (Enemy[] row : enemies)
            {
                for (int i = 0; i < row.length; i++)
                {
                    background.remove(row[i].getImage());
                }
            }
            for (Laser l : playersLasers)
            {
                background.remove(l.getImage());
            }
            for (Laser l : enemyLasers)
            {
                background.remove(l.getImage());
            }
            JLabel end = new JLabel("Game Over!", JLabel.CENTER);
            JLabel end2 = new JLabel("Your Score: " + p1.getScore(), JLabel.CENTER);
            end.setForeground(Color.white);
            end.setFont(new Font("IMPACT", Font.PLAIN, 90));
            end.setBounds(0, 0, windowWidth, windowHeight);
            end.setVisible(true);
            end2.setForeground(Color.white);
            end2.setFont(new Font("IMPACT", Font.PLAIN, 90));
            end2.setBounds(0, 90, windowWidth, windowHeight);
            end2.setVisible(true);
            background.add(end);
            background.add(end2);
        }
    }
}
