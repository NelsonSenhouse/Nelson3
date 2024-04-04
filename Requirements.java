import java.util.ArrayList;

public class Requirements
{
    public Requirements()
    {
        RegEnemy regE = new RegEnemy();
        useSet(newArrayList());
        System.out.println(findLife(regE));
        remove(newArrayList());
        selectionSort(newArrayList());
        insertionSort(newArrayList());
        colMajor();
    }

    public ArrayList<Enemy> newArrayList()
    {
        ArrayList<Enemy> ens = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            RegEnemy e = new RegEnemy();
            ens.add(e);
        }
        return ens;
    }

    public void remove(ArrayList<Enemy> ens)
    {
        for (int i = ens.size() - 1; i >= 0; i--)
        {
            if (ens.get(i).getRandVar() < 5)
            {
                System.out.print(ens.remove(i).getRandVar() + " ");
            }
        }
        System.out.println();
    }

    public void useSet(ArrayList<Enemy> ens)
    {
        System.out.println(ens.set(5, new RegEnemy()));
    }

    public void selectionSort(ArrayList<Enemy> ens)
    {
        for (int i = 0; i < ens.size(); i++)
        {
            Enemy min = ens.get(i);
            int  minIndex = i;
            for (int j = i; j < ens.size(); j++)
            {
                if (ens.get(j).getRandVar() < min.getRandVar())
                {
                    min = ens.get(j);
                    minIndex = j;
                }
            }
            Enemy temp = ens.get(i);
            ens.set(i, min);
            ens.set(minIndex, temp);
        }
        for (Enemy e : ens)
        {
            System.out.print(e.getRandVar() + " ");
        }
        System.out.println();
    }

    public void insertionSort(ArrayList<Enemy> ens)
    {
        for (int i = 1; i < ens.size(); ++i)
        {
            Enemy target = ens.get(i);
            int j = i - 1;
            while (j >= 0 && ens.get(j).getRandVar() > target.getRandVar())
            {
                ens.set(j + 1, ens.get(j));
                j--;
            }
            ens.set(j + 1, target);
        }
        for (Enemy e : ens)
        {
            System.out.print(e.getRandVar() + " ");
        }
        System.out.println();
    }

    public int findLife(Enemy e)
    {
        return e.getLife();
    }

    public void colMajor()
    {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < nums[0].length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                System.out.print(nums[j][i]);
            }
            System.out.print(" ");
        }
    }

}
