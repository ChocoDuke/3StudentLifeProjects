import java.util.Scanner;
public class ScreenTimeTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int socialMediaTime = 0;
        int gamingTime = 0;
        int studyingTime = 0;
        int streamingTime = 0;

        int totalScreenTime = 0;
        int recordedSessions = 0;

        int option = 0;

        while (option != 6) {

            System.out.println();
            System.out.println("SCREEN-TIME TRACKER");
            System.out.println("1. Add social media time");
            System.out.println("2.Add gaming time");
            System.out.println("3.Add studying time");
            System.out.println("4. Add video time");
            System.out.println("5.View statistics");
            System.out.println("6. Exit");
            System.out.print("Choose an option:");

            option = input.nextInt();

            switch (option) {

                case 1: {
                    System.out.print("Enter social media minutes: ");
                    int minutes = input.nextInt();

                    if (minutes <= 0) {
                        System.out.println(
                                "Invalid time. Minutes must be greater than 0"
                        );
                    } else {
                        socialMediaTime = socialMediaTime + minutes;
                        totalScreenTime = totalScreenTime + minutes;
                        recordedSessions = recordedSessions + 1;

                        System.out.println("Time added successfully!");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter gaming minutes:");
                    int minutes = input.nextInt();

                    if (minutes <= 0) {
                        System.out.println(
                                "Invalid time Minutes must be greater than 0."
                        );
                    } else {
                        gamingTime = gamingTime + minutes;
                        totalScreenTime = totalScreenTime + minutes;
                        recordedSessions = recordedSessions + 1;

                        System.out.println("Time added successfully!");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter studying minutes: ");
                    int minutes = input.nextInt();

                    if (minutes <= 0) {
                        System.out.println(
                                "Invalid time. Minutes must be greater than 0"
                        );
                    } else {
                        studyingTime = studyingTime + minutes;
                        totalScreenTime = totalScreenTime + minutes;
                        recordedSessions = recordedSessions + 1;

                        System.out.println("Time added successfully!");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter video or streaming minutes: ");
                    int minutes = input.nextInt();

                    if (minutes <= 0) {
                        System.out.println(
                                "Invalid timе Minutes must be greater than 0."
                        );
                    } else {
                        streamingTime = streamingTime + minutes;
                        totalScreenTime = totalScreenTime + minutes;
                        recordedSessions = recordedSessions + 1;

                        System.out.println("Time added successfully!");
                    }
                    break;
                }

                case 5: {
                    System.out.println("TODAY'S SCREEN TIME ");

                    System.out.println(
                            "Social media:" + socialMediaTime + " minutes"
                    );
                    System.out.println(
                            "Gaming: " + gamingTime + " minutes"
                    );
                    System.out.println(
                            "Studying: " + studyingTime + " minutes"
                    );
                    System.out.println(
                            "Streaming:" + streamingTime + " minutes"
                    );

                    System.out.println(
                            "Total screen time:" + totalScreenTime + " minutes"
                    );
                    System.out.println(
                            "Recorded sessions: " + recordedSessions
                    );

                    int entertainmentTime =
                            socialMediaTime + gamingTime + streamingTime;

                    System.out.println(
                            "Entertainment time: " + entertainmentTime + " minutes"
                    );

                    if (studyingTime > entertainmentTime) {
                        System.out.println(
                                "Study screen time is greater than entertainment screen time. Good balance!"
                        );
                    } else if (studyingTime < entertainmentTime) {
                        System.out.println(
                                "Entertainment screen time is greater than study time"
                        );
                    } else {
                        System.out.println(
                                "Study and entertainment screen time are equal."
                        );
                    }

                    if (totalScreenTime < 120) {
                        System.out.println("Daily screen time:Low screen time");
                    } else if (totalScreenTime <= 240) {
                        System.out.println("Daily screen time: Moderate screen time");
                    } else {
                        System.out.println("Daily screen time: High screen time");
                    }

                    break;
                }

                case 6:
                    System.out.println("Screen time tracker closed.");
                    break;

                default:
                    System.out.println(
                            "Invalid option Please choose from 1 to 6."
                    );
            }
        }

        input.close();
    }
}
