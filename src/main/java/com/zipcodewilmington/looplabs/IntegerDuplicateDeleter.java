package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {


        return Arrays
                .stream(array)
                .filter(number -> noOfOccurance(number)< maxNumberOfDuplications)
                .toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Arrays
                .stream(array)
                .filter(number -> noOfOccurance(number) != exactNumberOfDuplications)
                .toArray(Integer[]::new);

    }

    public Integer noOfOccurance(Integer number) {
        int count = 0;
        for (Integer i : array) {
            if (number.equals(i))
                count++;

        }
        return count;
    }
}


