package com.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Подсчитать количество содержащихся в данном тексте знаков препинания.
 */
public class VariantA {

    private String string;


   public int countPunctuationMarks(){

       int count = 0;
       Pattern pattern = Pattern.compile("\\p{Punct}");
       Matcher matcher = pattern.matcher(string);

       while (matcher.find()){
           count++;
       }

       return count;
   }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public VariantA(String string) {
        this.string = string;
    }

    public VariantA() {
    }
}
