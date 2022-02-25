import java.io.*;
class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] result;
        if(s.length()%k==0)
            result=new String[(s.length()/k)];
        else
            result=new String[(s.length()/k)+1];
      int i=0,j=0;
      
        while(j+k<s.length())
        {
           String str=s.substring(j,j+k);
            //System.out.println(str);
            result[i]=str;
            i++;
            j=j+k;
            //System.out.println(i+" "+j);
        }
        int x=k-(s.length()-j);
        String temp=(String.valueOf(fill)).repeat(x);
        result[i]=s.substring(j)+temp;
        return result;
    }
}
