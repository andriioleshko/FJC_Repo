package com.myfjc.text_file_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File myLyrics = new File("/home/el_barto/IdeaProjects/FJC_Repo/src/main/java/text_file_reader"
                    + "/data.txt");
            String[] listOfWords = getListOfWordsFromFile(myLyrics);

            List<Counter> countersOfBadOrShortWords = new ArrayList<>();
            List<Counter> countersOfGoodWords = new ArrayList<>();
            int totalNumberOfGoodWords = 0;
            int totalNumberOfBadWords = 0;
            for (String word : listOfWords) {
                boolean badOrShortWord = word.length() < 3 || itsABadWord(word);
                addNewWordOrIncreaseCount(word, (badOrShortWord)
                        ? countersOfBadOrShortWords
                        : countersOfGoodWords);
                if (!badOrShortWord) {
                    totalNumberOfGoodWords += 1;
                } else {
                    totalNumberOfBadWords += 1;
                }
            }
            System.out.printf("Total number of good words in the analyzed text-file is %d.\n",
                    totalNumberOfGoodWords);
            System.out.printf("Total number of bad (or short) words in the analyzed text-file is %d.\n",
                    totalNumberOfBadWords);
            /*System.out.println(countersOfBadOrShortWords.toString());*/
            String beginning = "The list of all bad and short words from this song are:";
            printFirstNWordsFromList(countersOfBadOrShortWords.size(), countersOfBadOrShortWords, beginning);

            int N = 5;
             beginning = String.format("\nThe top %d words from this song are:", N);
            printFirstNWordsFromList(N, countersOfGoodWords, beginning);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static String[] getListOfWordsFromFile(File myLyrics) throws FileNotFoundException {
        Scanner sc = new Scanner(myLyrics);
        String lyrics = "";
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            lyrics = lyrics.concat(data + " ");

        }
        lyrics = lyrics.replaceAll(",", "");
        lyrics = lyrics.replaceAll("\\.", "");
        lyrics = lyrics.replaceAll("\\?", "");
        lyrics = lyrics.replaceAll("!", "");
        lyrics = lyrics.toLowerCase();

        return lyrics.split(" ");
    }

    private static boolean itsABadWord(String word) {
        for (String badWord : getListOfBadWords()) {
            if (word.equalsIgnoreCase(badWord)) {
                return true;
            }
        }
        return false;
    }

    private static String[] getListOfBadWords() {
        return new String[]{"motherfuckin'", "biatch", "niggas", "bitch", "fuckin'", "motherfuckers",
                "nigga", "fuck"};
    }

    private static int getIndexOfACounter(String word, List<Counter> counters) {
        for (int i = 0; i < counters.size(); i++) {

            if (word.equalsIgnoreCase(counters.get(i).getValue())) {
                return i;
            }
        }
        return -1;
    }

    private static void addNewWordOrIncreaseCount(String word, List<Counter> counters) {
        int indexOfACounter = getIndexOfACounter(word, counters);
        if (indexOfACounter != -1) {
            Counter counter = counters.get(indexOfACounter);
            counter.setCount(counter.getCount() + 1);

            sortElement(indexOfACounter, counters);
        } else {
            Counter counter = new Counter();
            counter.setValue(word);
            counter.setCount(1);
            counters.add(counter);
        }
    }

    private static void sortElement(int indexOfACounter, List<Counter> counters) {
        boolean sortNeeded = true;
        while (sortNeeded && indexOfACounter > 0) {
            Counter currentCounter = counters.get(indexOfACounter);
            Counter previousCounter = counters.get(indexOfACounter - 1);
            int currentCount = currentCounter.getCount();
            int previousCount = previousCounter.getCount();
            if (currentCount > previousCount) {
                String tempValue = previousCounter.getValue();
                previousCounter.setValue(currentCounter.getValue());
                currentCounter.setValue(tempValue);
                previousCounter.setCount(currentCount);
                currentCounter.setCount(previousCount);
            } else {
                sortNeeded = false;
            }
            indexOfACounter--;
        }
        /*
        boolean b = (indexOfACounter > 0) %% (counters.get(indexOfACounter).getCount() > counters.get(indexOfACounter - 1).getCount());
        while (b) {

        }*/
    }

    private static void printFirstNWordsFromList(int N, List<Counter> counters, String beginning) {
        int maxIndex = Math.min(N, counters.size());
        int index = 0;
        StringBuilder words = new StringBuilder();
        while (index < maxIndex) {
            if (index > 0) {
                words.append(";\n");
            }
            words.append(counters.get(index).getValue()).append(" [")
                    .append(counters.get(index).getCount()).append("]");
            index++;
        }
        words.append(".");
        System.out.printf("%s\n%s", beginning, words);
    }
}

class Counter {
    private String value;
    private int count;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}