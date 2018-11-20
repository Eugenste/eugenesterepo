package ua.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Integer[] array = {4,5,-6,4,5,3,4,2,4,5,0};
        List<Integer> integers = new ArrayList<>(Arrays.asList(array));

        //Average
        int average = integers.stream().reduce(((left, right) -> left + right)).get() / integers.size();
        System.out.println(average);

        //min and index
        Integer minValue = integers.stream().reduce(Integer.MAX_VALUE, (left,right) -> left < right ? left : right);
        System.out.println("Min value " + minValue + " with index " + integers.indexOf(minValue) );

        //count zero elements
        System.out.println(integers.stream().filter(elem -> elem.equals(0)).collect(Collectors.toList()).size());

        //count >0
        System.out.println(integers.stream().filter(elem -> elem > 0).collect(Collectors.toList()).size());

        //multiply
        final int NUMBER_FOR_MULTIPLY = 2;
        System.out.println(integers.stream().map(elem -> elem * NUMBER_FOR_MULTIPLY).collect(Collectors.toList()).toString());


    }
}
