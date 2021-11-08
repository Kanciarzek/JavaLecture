package pl.edu.wsb_nlu.java.lecture5.enums;

public class MainWithDay2 {

    public static void main(String[] args) {
        Day2 day = Day2.MONDAY;
        switch (day.number) {
            case 1:
                System.out.println("Mondays are bad.");
                break;

            case 5:
                System.out.println("Fridays are better.");
                break;

            case 6:
            case 0:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("I don't mind midweek days.");
                break;
        }
    }

}
