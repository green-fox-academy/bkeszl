package com.gda.rest.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SithSpeak {
  public String sith_text;

  public SithSpeak(Sith sith) {
    String text = sith.getText();
    List<String> sentences = new ArrayList<>(Arrays.asList(text.split("\\. ")));
    StringBuilder sb = new StringBuilder();
    for (String sentence : sentences) {
      List<String> wordsOfSentence = Arrays.asList(sentence.split(" "));
      wordsOfSentence = purifyWords(wordsOfSentence);
      List<String> yodaSentence = yodaOrder(wordsOfSentence);
      for (int i = 0; i < yodaSentence.size(); i++) {
        if (i == 0) {
          sb.append(yodaSentence.get(i).substring(0, 1).toUpperCase());
          sb.append(yodaSentence.get(i).substring(1));
        } else {
          sb.append(yodaSentence.get(i));
        }
        if (i < yodaSentence.size() - 1) {
          sb.append(" ");
        }
      }
      sb.append(". ");
    }
    sb.append(randomWords());
    this.sith_text = sb.toString();
  }

  public SithSpeak() {
  }

  public String getSith_text() {
    return sith_text;
  }

  public void setSith_text(String sith_text) {
    this.sith_text = sith_text;
  }

  public List<String> purifyWords(List<String> inputWords) {
    for (int i = 0; i < inputWords.size(); i++) {
      if (inputWords.get(i).endsWith(".")) {
        inputWords.set(i, inputWords.get(i).substring(0, inputWords.get(i).length() - 1));
      }
      inputWords.set(i, inputWords.get(i).toLowerCase());
    }
    return inputWords;
  }

  public List<String> yodaOrder(List<String> inputWords) {
    List<String> toReturn = new ArrayList<>();
    for (int i = 0; i < inputWords.size(); i++) {

      if (inputWords.size() % 2 == 0) {

        if (i % 2 == 0) {
          toReturn.add(i, inputWords.get(i + 1));
        } else {
          toReturn.add(i, inputWords.get(i - 1));
        }

      } else {
        if (i == inputWords.size() - 1) {
          toReturn.add(inputWords.get(i));
          continue;
        }

        if (i % 2 == 0) {
          toReturn.add(i, inputWords.get(i + 1));
        } else {
          toReturn.add(i, inputWords.get(i - 1));
        }

      }
    }
    return toReturn;
  }

  public String randomWords() {
    Random random = new Random();
    List<String> yodaWords = new ArrayList<>(Arrays.asList("Hmm.", "Yes.", "The ghouls.", "Could be."));
    StringBuilder stringBuilder = new StringBuilder();
    int randomLength = random.nextInt(5);
    for (int i = 0; i < randomLength; i++) {
      stringBuilder.append(yodaWords.get(random.nextInt(4)));
      if (i != randomLength - 1) {
        stringBuilder.append(" ");
      }
    }
    return stringBuilder.toString();
  }
}
