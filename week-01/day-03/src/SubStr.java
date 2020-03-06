public class SubStr {
    public static void main(String[] args) {
    String str1 = "Mama, I just killed a man!";
    String str2 = "quack";
    String str3 = "kill";
    System.out.println(subStr(str1, str2));
    System.out.println(subStr(str1, str3));

    }

    public static int subStr(String input, String query) {
    return input.indexOf(query);
    }
}
