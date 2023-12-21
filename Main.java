public class Main
{
    public static void main(String[] args)
    {
        Algorithm a = new Algorithm();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int[] nums3 = {7, 8, 9};
        a.printArray(nums1);
        a.printArray(nums2);
        a.printArray(nums3);
        System.out.println();

        int[] nums4 = {1, 2, 3, 4};
        int[] nums5 = {5, 6, 7, 8};
        int[] nums6 = {9, 10, 11, 12};
        a.printArray(a.swapElements(nums4, 1, 2));
        a.printArray(a.swapElements(nums5, 2, 3));
        a.printArray(a.swapElements(nums6, 0, 3));
        System.out.println();

        int[] nums7 = {3, 2, 1};
        int[] nums8 = {6, 5, 100};
        int[] nums9 = {2, 10, 7};
        System.out.println(a.getMax(nums7));
        System.out.println(a.getMax(nums8));
        System.out.println(a.getMax(nums9));
        System.out.println();
        System.out.println(a.getMin(nums7));
        System.out.println(a.getMin(nums8));
        System.out.println(a.getMin(nums9));
        System.out.println();

        String[] words1 = {"Hello,", "world", "!"};
        String[] words2 = {"I", "am", "Nelson"};
        String[] words3 = {"What's", "your", "name?"};
        System.out.println(a.getMinWord(words1));
        System.out.println(a.getMinWord(words2));
        System.out.println(a.getMinWord(words3));
        System.out.println();
        System.out.println(a.getMaxWord(words1));
        System.out.println(a.getMaxWord(words2));
        System.out.println(a.getMaxWord(words3));
        System.out.println();

        int[] nums10 = {2, 3, 4};
        int[] nums11 = {-1, -2, -3};
        int[] nums12 = {2, 5, 10};
        System.out.println(a.bigDiff(nums10, nums11));
        System.out.println(a.bigDiff(nums10, nums12));
        System.out.println(a.bigDiff(nums11, nums12));
        System.out.println();

        double[] nums13 = {2.0, 3.0, 4.0, 5.0};
        double[] nums14 = {1.5, 2.5, 3.5, 4.5};
        double[] nums15 = {2.5, 3.5, 4.5, 5.5};
        System.out.println(a.findMean(nums13));
        System.out.println(a.findMean(nums14));
        System.out.println(a.findMean(nums15));
        System.out.println();

        a.printArray(nums1);
        a.reverseOrder(nums1);
        a.printArray(nums1);
        a.printArray(nums2);
        a.reverseOrder(nums2);
        a.printArray(nums2);
        a.printArray(nums3);
        a.reverseOrder(nums3);
        a.printArray(nums3);
        System.out.println();

        int[] nums16 = {1, 2, 3, 3, 4};
        int[] nums17 = {4, 4, 4, 4, 5};
        int[] nums18 = {9, 4, 5, 3, 7};
        System.out.println(a.hasConsecutive(nums16));
        System.out.println(a.hasConsecutive(nums17));
        System.out.println(a.hasConsecutive(nums18));
        System.out.println();

        int[] nums19 = {1, 0, -1};
        int[] nums20 = {-5, 0, -3};
        int[] nums21 = {6, 10, 22};
        System.out.println(a.negIndx(nums19));
        System.out.println(a.negIndx(nums20));
        System.out.println(a.negIndx(nums21));
        System.out.println();

        int[] nums22 = {1, 2, 3, 2};
        int[] nums23 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1};
        int[] nums24 = {1, 2, 3, 4, 5};
        System.out.println(a.hasEquivalentNums(nums22));
        System.out.println(a.hasEquivalentNums(nums23));
        System.out.println(a.hasEquivalentNums(nums24));
        System.out.println();

        int[] nums25 = {1, 2, 1, 1, 1};
        int[] nums26 = {2, 2, 4, 5, 6, 2, 2, 2, 2};
        int[] nums27 = {0, 0, 2};
        System.out.println(a.longestStreak(nums25, 1));
        System.out.println(a.longestStreak(nums26, 2));
        System.out.println(a.longestStreak(nums27, 0));
        System.out.println();

        String[] words4 = {"zebra", "alpha"};
        String[] words5 = {"hello", "my", "name", "is"};
        String[] words6 = {"x", "y", "a"};
        System.out.println(a.lastWord(words4));
        System.out.println(a.lastWord(words5));
        System.out.println(a.lastWord(words6));
    }
}
