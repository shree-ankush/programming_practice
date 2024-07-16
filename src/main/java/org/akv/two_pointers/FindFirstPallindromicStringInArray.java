package org.akv.two_pointers;

public class FindFirstPallindromicStringInArray {

//2108. Find First Palindromic String in the Array

    public String firstPalindrome(String[] words) {

        for(int i =0 ; i< words.length;i++){
            if(checkPallindrome(words[i])) return words[i];
        }
        return "";
    }
    public boolean checkPallindrome(String word){
        int start = 0 ;
        int end = word.length()-1;
        while(start<end){
            if(word.charAt(start) !=word.charAt(end)){
                return false;
            }
            else{
                start ++;
                end--;
            }
        }
        return true;
    }
}
