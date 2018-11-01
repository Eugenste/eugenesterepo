package ua.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer[] array = {4,5,-6,4,5,3,4,2,4,5,7};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(array));
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Integer integer: integers) {
           if (result.keySet().contains(integer)){
               Integer tmp = result.get(integer);
               result.put(integer,++tmp);
           }else {
               result.put(integer,1);
           }

        }
        System.out.println(result.entrySet());

    }
}
