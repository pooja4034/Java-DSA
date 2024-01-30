import java.util.*;

class setEleAtIndex{ //O(n)

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       // System.out.println(list);

        int setNo=list.set(2,10); //indx no

        System.out.println(setNo);
    }
}