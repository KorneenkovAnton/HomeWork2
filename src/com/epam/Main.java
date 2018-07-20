package com.epam;




public class Main {

    private static  final String TEST_TEXT = "some TExt, abOut programming? какой-то текст, про, программирвоание!";

    public static void main(String[] args) {
        VariantA variantA = new VariantA(TEST_TEXT);
        System.out.println("Count of punctuation: " + variantA.countPunctuationMarks());


        VariantB variantB = new VariantB();
        variantB.setText(TEST_TEXT);
        variantB.sortWords();

        for (Word word : variantB.getWords()){
            System.out.printf("Word: " + word.getWord() + " Proportion: %.2f \n",word.getProportion());
        }


        VariantC variantC = new VariantC();
        variantC.setText(TEST_TEXT);
        variantC.sortWords();

        for (Word word : variantC.getWords()){
            System.out.println(word.getWord());
        }

    }

}
