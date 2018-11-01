package ua.training;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer[] array = {4,5,-6,4,5,3,4,2,4,5,7};
        List<Integer> integers = new ArrayList<>(Arrays.asList(array));
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer integer: integers) {
           if (result.keySet().contains(integer)){
               Integer tmp = result.get(integer);
               result.put(integer,++tmp);
           }else {
               result.put(integer,1);
           }

        }
        System.out.println(result.entrySet());

        List<Integer> testIntegers = new ArrayListWithoutDelete<>();
        testIntegers.addAll(integers);
        System.out.println(testIntegers.size());
        testIntegers.remove(4);
        System.out.println(testIntegers.size());



    }
}
