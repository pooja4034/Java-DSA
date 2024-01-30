import java.util.*;

class getElement{ //O(1)

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int ele=list.get(2); //indx no

        System.out.println(ele);
    }
}