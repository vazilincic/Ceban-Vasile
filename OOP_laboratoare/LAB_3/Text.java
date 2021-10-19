package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class Text {
    private static final String VOWELS = "AEIOUaeiou";

    static int getNrOfSentences(String text) {
        if (text == null || text.isEmpty())
            return 0;

        boolean isInSentence = false;
        var counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i))) {
                isInSentence = true;
            }
            if ((text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') && (isInSentence)) {
                counter += 1;
                isInSentence = false;
            }
        }
        return counter;
    }

    static int getNrOfWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return Text.getWords(text).size();
    }

    static int getNrOfLetters(String text) {
        if (text == null || text.isEmpty())
            return 0;

        var counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    static int getNrOfVowels(String text) {
        if (text == null || text.isEmpty())
            return 0;

        var counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (VOWELS.indexOf(text.charAt(i)) != -1) {
                counter++;
            }
        }
        return counter;
    }

    static int getNrOfConsonants(String text) {
        if (text == null || text.isEmpty())
            return 0;

        var counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) && VOWELS.indexOf(text.charAt(i)) == -1) {
                counter++;
            }
        }
        return counter;
    }

    static List<String> getMostOftenWords(String text, int nrOfMostOftenWords) {
        if (text == null || text.isEmpty() || nrOfMostOftenWords <= 0)
            return new ArrayList<>();

        var counter = new HashMap<String, Integer>();
        var words = Text.getWords(text);

        for (int i = 0; i < words.size(); i++) {
            var word = words.get(i);
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }

        return counter.entrySet() // order descending the HashMap and select the first N keys
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(nrOfMostOftenWords)
                .map(keyValue -> keyValue.getKey())
                .collect(Collectors.toList());
    }

    static String getLongestWord(String text) {
        if (text == null || text.isEmpty())
            return "";

        var longestWord = "";
        var words = Text.getWords(text);

        for (int i = 0; i < words.size(); i++) {
            var word = words.get(i);
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        return longestWord;
    }

    private static List<String> getWords(String text) {
        var collector = new ArrayList<String>();
        var wordStart = 0;
        var wordEnd = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i)) &&
                    (i == 0 || !Character.isLetterOrDigit(text.charAt(i - 1)))) {
                wordStart = i;
            }
            if (Character.isLetterOrDigit(text.charAt(i)) &&
                    (i + 1 == text.length() || !Character.isLetterOrDigit(text.charAt(i + 1)))) {
                wordEnd = i;

                var word = text.substring(wordStart, wordEnd + 1);
                collector.add(word);
            }
        }
        return collector;
    }
}
