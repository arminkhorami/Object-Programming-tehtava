package model;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> data;

    public Dictionary() {
        data = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        data.put(word.toLowerCase(), meaning);
    }

    public String getMeaning(String word) {
        if (word == null || word.isEmpty()) {
            return "Please enter a word!";
        }

        String meaning = data.get(word.toLowerCase());

        if (meaning == null) {
            return "Word not found!";
        }

        return meaning;
    }
}