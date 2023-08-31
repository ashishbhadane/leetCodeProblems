package org.example;

import java.util.Arrays;

public class arraySorting {


    public static void arraySort(int[] numarray1) {

        int[] numArray1 = numarray1;
        Arrays.sort(numArray1);
        for (int x : numArray1
        ) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] numArray = {5, 3, 9, 12, 45};
        arraySort(numArray);
    }
    }

