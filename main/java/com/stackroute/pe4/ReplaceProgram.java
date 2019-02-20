package com.stackroute.pe4;

public class ReplaceProgram {
    public String ReplaceFunc(String str,String a,String b)
    {
        String s1=str.replace(a,"f");
        String s2=s1.replace(b,"t");
        return s2;
    }

}
