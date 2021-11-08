package pl.edu.wsb_nlu.java.lecture5.enums;

public class Main {

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("I don't mind midweek days.");
                break;
        }
    }

}
