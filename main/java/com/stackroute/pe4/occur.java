package com.stackroute.pe4;

public class occur {
    int count=0;
    int OccurrenceFunc(String str,String c)
    {
        count=str.length()-str.replace(c,"").length();
        return count;
    }

}
