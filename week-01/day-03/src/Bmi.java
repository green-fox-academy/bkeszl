public class Bmi {
    public static void main(String[] args) {
        double massInKg = 88.2;
        double heightInM = 1.97;

        // Print the Body mass index (BMI) based on these values
        double bmi = massInKg/(Math.pow(heightInM, 2));
        System.out.println(bmi);

    }
}