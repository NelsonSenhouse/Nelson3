import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200.0);
        list.add(true);
        list.add("apple");

        System.out.println(list.size());
        System.out.println(list.add("tree"));
        list.add(4, "pie");
        System.out.println(list.get(3));
        System.out.println(list.set(1, 200.1));
        System.out.println(list.remove(0));
        System.out.println(list);
    }
}