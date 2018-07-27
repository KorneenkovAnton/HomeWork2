package com.epam;




public class Main {

    private static  final String TEST_TEXT = "some TExt, abOut programming? какой-то текст, про, программирвоание!";

    public static void main(String[] args) {
        SignCounter signCounter = new SignCounter(TEST_TEXT);
        System.out.println("Count of punctuation: " + signCounter.countPunctuationMarks());


        ProportionCounter proportionCounter = new ProportionCounter();
        proportionCounter.setText(TEST_TEXT);
        proportionCounter.sortWords();

        for (Word word : proportionCounter.getWords()){
            System.out.printf("Word: " + word.getWord() + " Proportion: %.2f \n",word.getProportion());
        }


        LenghtSorting lenghtSorting = new LenghtSorting();
        lenghtSorting.setText(TEST_TEXT);
        lenghtSorting.sortWords();

        for (Word word : lenghtSorting.getWords()){
            System.out.println(word.getWord());
        }

    }

}
