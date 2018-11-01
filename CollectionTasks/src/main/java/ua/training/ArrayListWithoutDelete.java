package ua.training;

import java.util.ArrayList;

public class ArrayListWithoutDelete<E> extends ArrayList<E> {

    @Override
    public E remove(int index) {
        System.out.println("You've tried to delete this: " + super.get(index) + ". It's Illegal!!!");
        return super.get(index);
    }
}
