package com.gfa;

public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText applying indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String todoTitle = "My todo:\n";
    String gamesTodo = " - Download games\n";
    String gamesListItem = "\t - Diablo";

    todoText = todoTitle + todoText + gamesTodo + gamesListItem;

    System.out.println(todoText);
  }
}