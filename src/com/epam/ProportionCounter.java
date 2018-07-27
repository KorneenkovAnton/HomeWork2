package com.epam;

import java.util.*;

/**
 * Рассортировать слова текста по возрастанию доли гласных букв (отноше-
 * ние количества гласных к общему количеству букв в слове).
 */
public class ProportionCounter {

    private String text = "" ;
    List<Word> words;



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.words = splitText(text);
    }

    public List<Word> getWords() {
        return words;
    }


    protected ArrayList<Word> splitText(String text){
        ArrayList<Word> wordsCollection = new ArrayList<>();
        String[] wordsArray = text.split("[\\p{Punct}\\s]+");

        for (String word: wordsArray) {
            wordsCollection.add(new Word(word));
        }
        return wordsCollection;
    }

    public void sortWords(){
        Collections.sort(this.getWords(), new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getProportion() < o2.getProportion() ? -1 : o1.getProportion() == o2.getProportion() ? 0 : 1;
            }
        });

    }

    public ProportionCounter(String text) {
        this.text = text;
        this.words = splitText(text);
    }

    public ProportionCounter() {
        this.words = new ArrayList<>();
    }
}
