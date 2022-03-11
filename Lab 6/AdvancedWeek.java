public class AdvancedWeek {
    // Initializing variables
    private int days_index = 1;
    private String day_1 = "Monday";
    private String day_2 = "Tuesday";
    private String day_3 = "Wednesday";
    private String day_4 = "Thursday";
    private String day_5 = "Friday";
    private String day_6 = "Saturday";
    private String day_7 = "Sunday";

    // printing out the days
    public void printDays() {
        System.out.println(days_index+": "+day_1+",\n"+ days_index++ +": "+day_2+
                ",\n"+ days_index++ +": "+day_3+",\n"+ days_index++ +": "+day_4+
                ",\n"+ days_index++ +": "+day_5+",\n"+ days_index++ +": "+day_6+",\n"+ days_index++ +": "+day_7+".");
    }
}