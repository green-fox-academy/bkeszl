public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int avgDailyCodingHours = 6;
        int semesterLenghtWeeks = 17;
        int codingDaysPerWeek = 5;
        int weeklyWorkHours = 52;

        int semesterCodingHours = avgDailyCodingHours*semesterLenghtWeeks*codingDaysPerWeek;
        System.out.println("Hours spent coding:" + semesterCodingHours);
        float percentageCodingHours = ((float) (avgDailyCodingHours*codingDaysPerWeek)/weeklyWorkHours)*100;
        System.out.println("Percentage of hours spent coding:" + percentageCodingHours +" %");
    }
}