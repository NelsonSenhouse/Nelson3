import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Algorithm a = new Algorithm();

        Integer[] numbers = {1, 2, 2, 3, 3};
        Integer[] numbers2 = {4, 5, 6, 6, 7, 7,};
        Integer[] numbers3 = {1, 2, 3, 4, 4, 4, 6, 6, 7, 8, 9, 10, 10};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(numbers2));
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(numbers3));

        a.removeDups(nums);
        a.removeDups(nums2);
        a.removeDups(nums3);
        System.out.println();

        a.removeNum(nums, 2);
        a.removeNum(nums2, 7);
        a.removeNum(nums3, 4);
        System.out.println();

        a.insertNum(nums, 4);
        a.insertNum(nums2, 6);
        a.insertNum(nums3, 5);
    }
}