package com.epam;


import java.util.Collections;
import java.util.Comparator;

/**
 * Все слова текста рассортировать в порядке убывания их длин, при этом все
 * слова одинаковой длины рассортировать в порядке возрастания в них коли-
 * чества гласных букв.
*/
public class LenghtSorting extends ProportionCounter {

    @Override
    public void sortWords() {

        Collections.sort(super.getWords(), new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getWord().length() < o2.getWord().length() ? 1 : o1.getWord().length() > o2.getWord().length()
                        ? -1 : o1.getProportion() * o1.getWord().length() < o2.getProportion() * o2.getWord().length()
                        ? -1 : o1.getProportion() * o1.getWord().length() > o2.getProportion() * o2.getWord().length()
                        ? 1 : 0;
            }
        });

    }
}
