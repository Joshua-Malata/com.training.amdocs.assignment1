package com.training.amdcs;

public class number2 {
    public static void main(String[] args){
        String str = "i love java";
        String words[]=str.split("\\s");
        String capitalizeStr="";

        for(String word:words){
            String firstLetter=word.substring(0,1);
            String remainingLetters=word.substring(1);
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStr);
    }
}
