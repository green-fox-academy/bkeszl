public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder myString = new StringBuilder(quote);
        int indexOfIt = myString.indexOf("It");
        myString =  myString.insert(indexOfIt+2," always takes longer than");
        System.out.println(myString);
    }
}