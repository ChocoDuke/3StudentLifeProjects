import java.util.Scanner;
public class StudyTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int weeklyGoal = 600;

        int programming = 0;
        int mathematics = 0;
        int english = 0;
        int other = 0;

        int totalStudyTime = 0;
        int studySessions = 0;

        int option = 0;

        while (option != 4) {

            System.out.println();
            System.out.println("STUDY TRACKER");
            System.out.println("1.Add study session");
            System.out.println("2. View statistics");
            System.out.println("3.Check weekly goal");
            System.out.println("4.Exit");
            System.out.print("Choose an option: ");

            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Choose subject:");
                    System.out.println("1. Programming");
                    System.out.println("2.Mathematics");
                    System.out.println("3.English");
                    System.out.println("4.Other");
                    System.out.print("Choose an option: ");

                    int subject = input.nextInt();

                    if (subject < 1 || subject > 4) {
                        System.out.println("Invalid subject choice.");
                    } else {
                        System.out.print("Study time in minutes:");
                        int minutes = input.nextInt();

                        if (minutes <= 0) {
                            System.out.println(
                                    "Invalid study time Time must be greater than 0."
                            );
                        } else {
                            if (subject == 1) {
                                programming = programming + minutes;
                            } else if (subject == 2) {
                                mathematics = mathematics + minutes;
                            } else if (subject == 3) {
                                english = english + minutes;
                            } else {
                                other = other + minutes;
                            }

                            totalStudyTime = totalStudyTime + minutes;
                            studySessions = studySessions + 1;

                            System.out.println("Study session added!");
                            System.out.println(
                                    "Current total study time: "
                                            + totalStudyTime + " minutes"
                            );
                        }
                    }
                    break;

                case 2:
                    System.out.println("WEEKLY STATISTICS");
                    System.out.println("Study sessions:" + studySessions);
                    System.out.println(
                            "Total study time:" + totalStudyTime + " minutes"
                    );
                    System.out.println("Programming: " + programming + " minutes");
                    System.out.println("Mathematics:" + mathematics + " minutes");
                    System.out.println("English:" + english + " minutes");
                    System.out.println("Other: " + other + " minutes");
                    break;

                case 3:
                    System.out.println("Weekly goal: " + weeklyGoal + " minutes");
                    System.out.println(
                            "You studied: " + totalStudyTime + " minutes"
                    );

                    if (totalStudyTime >= weeklyGoal) {
                        System.out.println("Remaining: 0 minutes");
                        System.out.println("Weekly goal achieved!");
                    } else {
                        int remaining = weeklyGoal - totalStudyTime;
                        System.out.println("Remaining:" + remaining + " minutes");
                    }
                    break;

                case 4:
                    System.out.println(
                            "Study tracker closed keep up the good work!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid option. Please choose from 1 to 4."
                    );
            }
        }

        input.close();
    }
}