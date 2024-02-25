package org.example.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class sort {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Arrays.sort(array);

        List<Integer> collection = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.sort(collection);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).sorted();

    }
}
