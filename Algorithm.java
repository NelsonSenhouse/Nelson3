import java.util.ArrayList;
import java.util.Arrays;

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
        if (x > nums.get(nums.size() - 1)) nums.add(x);
        else if (x < nums.get(0)) nums.add(0, x);
        else
        {
            for (int i = 0; i < nums.size() - 1; i++)
            {
                if (nums.get(i) < x && x <= nums.get(i + 1)) nums.add(i + 1, x);
            }
        }
        System.out.println(nums);
    }

    public boolean areArraysReversed(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        for (int i = 0; i < list1.size() / 2; i++)
        {
            if (list1.get(i) != list2.get(list2.size() - 1 - i)) return false;
        }
        return true;
    }

    public int findMaxNum(ArrayList<Integer> list)
    {
        int max = list.get(0);
        for (Integer i : list)
        {
            if (i > max) max = i;
        }
        return max;
    }

    public int findMinNum(ArrayList<Integer> list)
    {
        int min = list.get(0);
        for (Integer i : list)
        {
            if (i < min) min = i;
        }
        return min;
    }

    public String findShortLong(ArrayList<String> w)
    {
        String shortWord = w.get(0);
        for (String word : w)
        {
            if (word.length() < shortWord.length()) shortWord = word;
        }
        return shortWord;
    }

    public String findLongWord(ArrayList<String> w)
    {
        String longWord = w.get(0);
        for (String word : w)
        {
            if (word.length() > longWord.length()) longWord = word;
        }
        return longWord;
    }

    public int biggestDiff(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        int diff = 0;
        int bigDiff = Math.abs(list1.get(0) - list2.get(0));
        for (int i = 0; i < list1.size(); i++)
        {
            diff = Math.abs(list1.get(i) - list2.get(i));
            if (diff > bigDiff) bigDiff = diff;
        }
        return bigDiff;
    }

    public double findAvg(ArrayList<Double> nums)
    {
        double sum = 0.0;
        for (Double d : nums)
        {
            sum+= d;
        }
        return sum / nums.size();
    }

    public void reverseList(ArrayList<Integer> nums)
    {
        for (int i = 0; i < nums.size() / 2; i++)
        {
            int temp = nums.get(i);
            nums.set(i, nums.get(nums.size() - 1 - i));
            nums.set(nums.size() - 1 - i, temp);
        }
        System.out.println(nums);
    }

    public boolean hasConsectuiveNums(ArrayList<Integer> nums)
    {
        for (int i = nums.size() - 1; i > 0; i--)
        {
            if (nums.get(i) == nums.get(i - 1)) return true;
        }
        return false;
    }

    public int firstNeg(ArrayList<Integer> nums)
    {
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums.get(i) < 0) return i;
        }
        return -1;
    }
    public boolean hasEqualValues(ArrayList<Integer> nums)
    {
        for (int i = 0; i < nums.size() - 1; i++)
        {
            for (int j = i + 1; j < nums.size(); j++)
            {
                if (nums.get(j) == nums.get(i)) return true;
            }
        }
        return false;
    }
}
