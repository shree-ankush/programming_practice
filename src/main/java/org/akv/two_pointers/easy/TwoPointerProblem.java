package org.akv.two_pointers.easy;

import java.util.ArrayList;


/**
 *method : shortestDistanceToChar, Time : 1Hr
 *  */


public class TwoPointerProblem {


    public int[] shortestDistanceToChar(String s, char c) {
        int [] answer  = new int[s.length()];

        char[] sArr = s.toCharArray();

        int currIndex = s.indexOf(c,0);

        while(currIndex!=-1 && currIndex<s.length()) {
            System.out.println(currIndex);
            int left = currIndex - 1, right = currIndex + 1;
            System.out.println(left+" "+currIndex+" "+right);
            answer[currIndex]=currIndex;


           while(left>=0&&right<=answer.length-1){
               System.out.println(left+" "+right);
               if (sArr[left] != c) {
                   if(answer[left]==0)
                       answer[left]=Math.abs(currIndex - left);
                   answer[left] = Math.min(Math.abs(currIndex - left), answer[left]);

               }
               if (sArr[right] != c) {
                   if(answer[right]==0)
                   {

                       answer[right]=Math.abs(currIndex - right);
                       System.out.println("in right check : "+sArr[right]+" "+answer[right]+" "+right);

                   }
                   else
                        answer[right] = Math.min(Math.abs(currIndex - right), answer[right]);

               }
               answer[currIndex]=0;
               right++;
               left--;

           }
            for (int i =0;i<sArr.length;i++)
            {
                System.out.print(s.charAt(i)+" ");}
            System.out.println();
            for (int i =0;i<sArr.length;i++)
            {
                System.out.print(answer[i]+" ");
            }
            currIndex=s.indexOf(c, currIndex+1);
        }

        return  answer;
    }

}
