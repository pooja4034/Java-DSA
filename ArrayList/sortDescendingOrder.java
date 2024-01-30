import java.util.*;

class sortDescendingOrder{

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(6);
        list.add(45);
        list.add(0);

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}