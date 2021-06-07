import java.util.Arrays;

public class Anagram {

  //used the one from last week :)
  public static boolean isAnagram(String a, String b) {
    char[] aToChar = a.toCharArray();
    char[] bToChar = b.toCharArray();
    Arrays.sort(aToChar);
    Arrays.sort(bToChar);
    if (a.length()!=b.length()){
      return false;
    }

    for (int i = 0; i <a.length() ; i++) {
      if (aToChar[i]!=bToChar[i]) {
        return false;
      }
    }
    return true;
  }
}
