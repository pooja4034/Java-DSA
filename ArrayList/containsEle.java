import java.util.*;

class containsEle{ //O(n)  check element exist or not

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       System.out.println(list);

        System.out.println(list.contains(4));
    }
}