package com.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Подсчитать количество содержащихся в данном тексте знаков препинания.
 */
public class VariantA {

    private String text;


   public int countPunctuationMarks(){

       int count = 0;
       Pattern pattern = Pattern.compile("\\p{Punct}");
       Matcher matcher = pattern.matcher(text);

       while (matcher.find()){
           count++;
       }

       return count;
   }

    public String getText() {
        return text;
    }

    public void setString(String text) {
        this.text = text;
    }

    public VariantA(String text) {
        this.text = text;
    }

    public VariantA() {
    }
}
