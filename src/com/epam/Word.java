package com.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Word  {

    private String word;
    private double proportion;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getProportion() {
        return proportion;
    }

    public void setProportion() {
        this.proportion = countProportion(this.word);

    }

    public Word(String word) {
        this.word = word;
        this.proportion = countProportion(word);
    }

    public Word() {
    }


    private double countProportion(String word){
        double lenght = word.length();
        double countOfGLetter = 0;

        String patternStRu = "(?ui:[уеыаоэяиюёaeiouy])";

        Pattern pattern = Pattern.compile(patternStRu);
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()){
            countOfGLetter++;
        }


        return countOfGLetter/lenght;
    }

}
