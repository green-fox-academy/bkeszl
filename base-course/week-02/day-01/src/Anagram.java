import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String one = "dog";
        String two = "god";
        if (isAnagram(one, two)) {
            System.out.println("anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
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
