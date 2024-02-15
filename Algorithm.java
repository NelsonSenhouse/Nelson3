import java.util.ArrayList;
public class Algorithm
{
    public void removeDups(ArrayList<Integer> nums)
    {
        for (int i = nums.size() - 1; i > 0; i--)
        {
            if (nums.get(i) == nums.get(i - 1)) nums.remove(i);
        }
        System.out.println(nums);
    }

    public void removeNum(ArrayList<Integer> nums, int target)
    {
        for (int i = nums.size() - 1; i >= 0; i--)
        {
            if (nums.get(i) == target) nums.remove(i);
        }
        System.out.println(nums);
    }

    public void insertNum(ArrayList<Integer> nums, int x)
    {
        if (x < nums.get(0)) nums.add(0, x);
        else if (x > nums.get(nums.size() - 1)) nums.add(x);
        else
        {
            for (int i = 0; i < nums.size() - 1; i++)
            {
                if (nums.get(i) <= x && x <= nums.get(i + 1)) nums.add(i, x);
            }
        }
        System.out.println(nums);
    }
}
