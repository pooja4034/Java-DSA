import java.util.*;

class RemoveElement{ //O(n)

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int rem=list.remove(2); //indx no

        System.out.println(rem);
        System.out.println(list);
    }
}