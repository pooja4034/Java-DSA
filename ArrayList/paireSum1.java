import java.util.*;

class paireSum1{ //using brut force(all possible paires)

    public static boolean sumpaire(ArrayList<Integer> list,int target)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==target)
                {
                    return true;
                }
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

        int targe=5;

        System.out.println(sumpaire(list,targe));
    }
}
