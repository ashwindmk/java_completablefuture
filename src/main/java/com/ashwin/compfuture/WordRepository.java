package com.ashwin.compfuture;

import java.util.ArrayList;
import java.util.List;

public class WordRepository {
    public List<String> getWords() {
        System.out.println("comp-future: WordRepository: getWords() on thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("bike");
        words.add("cup");
        words.add("cupboard");
        words.add("cupcake");
        words.add("donut");

        return words;
    }
}
