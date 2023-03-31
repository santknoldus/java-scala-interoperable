package com.knoldus.interoperable;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private final List<Integer> array = new ArrayList<>();

    void addElementToList(int element) {
        array.add(element);
    }

    String removeElementFromList(int element) {
        if (array.contains(element)) {
            array.remove(Integer.valueOf(element));
            return "Element removed";
        } else return "Element Not Found";
    }

    void removeAllElementsOfList() {
        array.clear();
    }

    boolean checkIfContains(int element) {
        return array.contains(element);
    }
}