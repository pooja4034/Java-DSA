import java.util.*;

class paireSum2{ //pointter approach

    public static boolean sumpaire(ArrayList<Integer> list,int targe)
    {
        int lpt=0;
        int rpt=list.size()-1;

        while(rpt != lpt)
        {
            if(list.get(lpt)+list.get(rpt) == targe)
            {
                return true;
            }

            if(list.get(lpt)+list.get(rpt) < targe)
            {
                lpt++;
            }
            else
            {
                rpt--;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);

        int targe=7;

        System.out.println(sumpaire(list,targe));
    }
}