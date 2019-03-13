package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        return Arrays
                .stream(array)
                .filter(str -> noOfStrings(str) < maxNumberOfDuplications)
                .toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        return Arrays
                .stream(array)
                .filter(str ->noOfStrings(str) != exactNumberOfDuplications)
                .toArray(String[]::new);
    }

    public Integer noOfStrings(String str){
        int count =0;
        for (String s : array) {
            if(str.equals(s))
                count++;
        }
        return  count;
    }
}
