import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Algorithm a = new Algorithm();

        Integer[] numbers = {1, 2, 2, 3, 3};
        Integer[] numbers2 = {4, 5, 6, 6, 7, 7,};
        Integer[] numbers3 = {1, 4, 2, 3, 4, 4, 4, 6, 6, 7, 8, 9, 10, 10};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(numbers2));
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(numbers3));

        a.removeDups(nums);
        a.removeDups(nums2);
        a.removeDups(nums3);
        System.out.println();

        nums = new ArrayList<>(Arrays.asList(numbers));
        nums2 = new ArrayList<>(Arrays.asList(numbers2));
        nums3 = new ArrayList<>(Arrays.asList(numbers3));
        a.removeNum(nums, 2);
        a.removeNum(nums2, 7);
        a.removeNum(nums3, 4);
        System.out.println();

        nums = new ArrayList<>(Arrays.asList(numbers));
        nums2 = new ArrayList<>(Arrays.asList(numbers2));
        nums3 = new ArrayList<>(Arrays.asList(numbers3));
        a.insertNum(nums, 4);
        a.insertNum(nums2, 6);
        a.insertNum(nums3, 5);
        System.out.println();

        Integer[] numbers4 = {1, 2, 3};
        Integer[] numbers5 = {3, 2, 1};
        Integer[] numbers6 = {10, 10, 9, 8, 7, 6, 6, 4, 4, 4, 3, 2, 4, 1};
        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(numbers4));
        ArrayList<Integer> nums5 = new ArrayList<>(Arrays.asList(numbers5));
        ArrayList<Integer> nums6 = new ArrayList<>(Arrays.asList(numbers6));
        System.out.println(a.areArraysReversed(nums4, nums5));
        System.out.println(a.areArraysReversed(nums3, nums6));
        System.out.println(a.areArraysReversed(nums, nums2));
        System.out.println();

        System.out.println(a.findMaxNum(nums4));
        System.out.println(a.findMaxNum(nums5));
        System.out.println(a.findMaxNum(nums6));
        System.out.println();

        System.out.println(a.findMinNum(nums4));
        System.out.println(a.findMinNum(nums5));
        System.out.println(a.findMinNum(nums6));
        System.out.println();

        String[] strings = {"Hello,", "World", "!"};
        String[] strings2 = {"My Name is", "Nelson", "Senhouse"};
        String[] strings3 = {"How ar", "e yo", "u today?"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(strings));
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList(strings2));
        ArrayList<String> words3 = new ArrayList<>(Arrays.asList(strings3));
        System.out.println(a.findShortLong(words));
        System.out.println(a.findShortLong(words2));
        System.out.println(a.findShortLong(words3));
        System.out.println();

        System.out.println(a.findLongWord(words));
        System.out.println(a.findLongWord(words2));
        System.out.println(a.findLongWord(words3));
        System.out.println();

        Integer[] numbers7 = {2, 3, 4};
        Integer[] numbers8 = {-1, -2, -3};
        ArrayList<Integer> nums7 = new ArrayList<>(Arrays.asList(numbers7));
        ArrayList<Integer> nums8 = new ArrayList<>(Arrays.asList(numbers8));
        System.out.println(a.biggestDiff(nums7, nums8));
        System.out.println(a.biggestDiff(nums4, nums5));
        System.out.println(a.biggestDiff(nums6, nums3));
        System.out.println();

        Double[] numbers9 = {1.5, 3.5, 5.5};
        Double[] numbers10 = {100.7, 20.6, 11.9, 67.8};
        Double[] numbers11 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        ArrayList<Double> nums9 = new ArrayList<>(Arrays.asList(numbers9));
        ArrayList<Double> nums10 = new ArrayList<>(Arrays.asList(numbers10));
        ArrayList<Double> nums11 = new ArrayList<>(Arrays.asList(numbers11));
        System.out.println(a.findAvg(nums9));
        System.out.println(a.findAvg(nums10));
        System.out.println(a.findAvg(nums11));
        System.out.println();

        a.reverseList(nums4);
        a.reverseList(nums2);
        a.reverseList(nums7);
        System.out.println();

        Integer[] numbers12 = {1, 2, 3, 3, 4};
        ArrayList<Integer> nums12 = new ArrayList<>(Arrays.asList(numbers12));
        System.out.println(a.hasConsectuiveNums(nums12));
        System.out.println(a.hasConsectuiveNums(nums6));
        System.out.println(a.hasConsectuiveNums(nums8));
        System.out.println();

        Integer[] numbers13 = {1, 0, -1};
        ArrayList<Integer> nums13 = new ArrayList<>(Arrays.asList(numbers13));
        System.out.println(a.firstNeg(nums13));
        System.out.println(a.firstNeg(nums8));
        System.out.println(a.firstNeg(nums3));
        System.out.println();

        Integer[] numbers14 = {1, 2, 3, 2};
        Integer[] numbers15 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 10};
        ArrayList<Integer> nums14 = new ArrayList<>(Arrays.asList(numbers14));
        ArrayList<Integer> nums15 = new ArrayList<>(Arrays.asList(numbers15));
        System.out.println(a.hasEqualValues(nums14));
        System.out.println(a.hasEqualValues(nums15));
        System.out.println(a.hasEqualValues(nums5));
    }
}
