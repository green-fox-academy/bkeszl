public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(toBeReversed));
    }

    public static String reverse(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <input.length(); i++) {
            builder = builder.insert(i, input.charAt(input.length() - i - 1));
        }
        return builder.toString();
    }
}