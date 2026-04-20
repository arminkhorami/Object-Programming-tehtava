package controller;

import model.Dictionary;

public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();

        // sample data
        dictionary.addWord("java", "A programming language");
        dictionary.addWord("hello", "A greeting");
        dictionary.addWord("computer", "An electronic device");
    }

    public String search(String word) {
        return dictionary.getMeaning(word);
    }
}