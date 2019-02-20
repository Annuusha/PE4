package com.stackroute.pe4;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Sort {
    public String[] SortFunc(String str) {
        String[] a=str.split(" ");
        Arrays.sort(a);
        return a;
    }
}
