package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence {
    String temp="";
    public String MultipleOccurrenceFunc(String str,String s1)
    {
    String str1=str.toLowerCase();
    Pattern p=Pattern.compile(s1);
    Matcher m=p.matcher(str);
 while(m.find())
     temp+="Found at:"+m.start()+"-"+m.end()+" ";

     return temp.trim();
    }
}
