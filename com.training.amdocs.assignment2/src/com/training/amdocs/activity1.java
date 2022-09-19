package com.training.amdocs;
import java.util.*;
public class activity1 {
    public static void main(String[] args) {

        String dup = "aabbbbeeeeffggg";
        int i, j, k = 0, countNumberOfOccur = 0;
        String duplicate = new String("");
        for(i=0; i<dup.length(); i++)
        {
            countNumberOfOccur = 0;
            for(j=0; j<=i; j++)
            {
                if(dup.charAt(i)==dup.charAt(j))
                {
                    countNumberOfOccur++;
                }
            }
            if(countNumberOfOccur==1)
            {
                duplicate = duplicate + dup.charAt(i);
            }
        }
        for(i=0; i<duplicate.length(); i++)
        {
            countNumberOfOccur = 0;
            for(j=0; j<dup.length(); j++)
            {
                if(duplicate.charAt(i)==dup.charAt(j))
                {
                    countNumberOfOccur++;
                }
            }
            if(countNumberOfOccur==1)
            {
                System.out.printf("%c",duplicate.charAt(i));
            }
            else
            {
                System.out.printf("%c%d",duplicate.charAt(i),countNumberOfOccur);
            }
        }

}
}
