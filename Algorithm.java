public class Algorithm
{
    public void printArray(int[] array)
    {
        for (int i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int[] swapElements(int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
        return array;
    }
    public int getMax(int[] array)
    {
        int max = array[0];
        for (int i : array)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }
    public int getMin(int[] array)
    {
        int min = array[0];
        for (int i : array)
        {
            if (i < min)
            {
                min = i;
            }
        }
        return min;
    }
    public String getMinWord(String[] array)
    {
        String minStr = array[0];
        for (String i : array)
        {
            if(i.length() < minStr.length())
            {
                minStr = i;
            }
        }
        return minStr;
    }
    public String getMaxWord(String[] array)
    {
        String maxStr = array[0];
        for (String i : array)
        {
            if(i.length() > maxStr.length())
            {
                maxStr = i;
            }
        }
        return maxStr;
    }
    public int bigDiff(int[] array, int[] array2)
    {
        int diff = Math.abs(array[0] - array2[0]);
        for (int i = 1; i < array.length; i++)
        {
            if (Math.abs(array[i] - array2[i]) > diff)
            {
                diff = Math.abs(array[i] - array2[i]);
            }
        }
        return diff;
    }
    public double findMean(double[] array)
    {
        double sum = 0.0;
        for (double i : array)
        {
            sum += i;
        }
        return sum / array.length;
    }
    public void reverseOrder(int[] array)
    {
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public boolean hasConsecutive(int[] array)
    {
        for (int i)
        {

        }
    }
}
