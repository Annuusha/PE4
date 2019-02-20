package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfName {
    public String PresenceOfNameFunc(String str)
    {
        String temp="Is Harry here ?";
       // String str1=str.toLowerCase();
        Pattern p=Pattern.compile("Harry+");
        Matcher m=p.matcher(str);
        if(m.find())
        {
            temp+=" true";
            return temp;
        }
        else
        {
            temp+="false";
            return temp;
        }
    }


}
