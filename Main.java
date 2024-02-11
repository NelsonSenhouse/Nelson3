import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(3); nums.add(2); nums.add(4); nums.add(2); nums.add(2); nums.add(5);

        for (int i = 0; i < nums.size(); i++)
        {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        int j = 0;
        while (j < nums.size())
        {
            System.out.print(nums.get(j) + " ");
            j++;
        }
        System.out.println();
        for (int k : nums)
        {
            System.out.print(k + " ");
        }
        System.out.println();

        removeNum(nums, 2);
        System.out.println(nums);
    }
    public static void removeNum(ArrayList<Integer> list, int target)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (list.get(i) == target) list.remove(i);
        }
    }
}