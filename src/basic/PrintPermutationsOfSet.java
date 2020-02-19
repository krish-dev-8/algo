package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintPermutationsOfSet{

    public static <T>  void printPermutationsOfSet (Set<T> source) {
        recursivePrintPermutationsOfSet(source,new ArrayList<>());
    }

    private static <T>  void recursivePrintPermutationsOfSet (Set<T> source,List<T> perm) {
        if(source.size()==0)
        {
            for(T t : perm)
            {
                System.out.print(t);
            }
            System.out.println();
        }
        else {
            for (T t : source) {
                Set<T> newSource = new HashSet<>(source);
                newSource.remove(t);
                List<T> newPerm = new ArrayList<>(perm);
                newPerm.add(t);
                recursivePrintPermutationsOfSet(newSource, newPerm);
            }
        }
    }
}
