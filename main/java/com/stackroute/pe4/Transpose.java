package com.stackroute.pe4;

public class Transpose {
   public String TransposeFunc(String str) {
       String temp="";
      String[] a=str.split(" ");
      for(int i=0;i<a.length;i++)
      {
          StringBuffer s1=new StringBuffer(a[i]);
          temp+=s1.reverse()+" ";

      }
      return temp.trim();

   }
}
