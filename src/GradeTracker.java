import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int assignmentPoints = 0;
        int assignmentCount = 0;

        int examPoints = 0;
        int examCount = 0;

        int option = 0;

        while (option != 4) {

            System.out.println();
            System.out.println(" SEMESTER GRADE TRACKER");
            System.out.println("1.Add assignment result");
            System.out.println("2.Add exam result");
            System.out.println("3.View current grade");
            System.out.println("4.Exit");
            System.out.print("Choose an option:");

            option = input.nextInt();

            switch (option) {

                case 1: {
                    System.out.print("Enter assignment score: ");
                    int score = input.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println(
                                "Invalid score. Enter a value from 0 to 100."
                        );
                    } else {
                        assignmentPoints = assignmentPoints + score;
                        assignmentCount = assignmentCount + 1;

                        System.out.println("Assignment score added");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter exam score:");
                    int score = input.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println(
                                "Invalid score Enter a value from 0 to 100."
                        );
                    } else {
                        examPoints = examPoints + score;
                        examCount = examCount + 1;

                        System.out.println("Exam score added.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("CURRENT RESULTS");

                    System.out.println(
                            "Assignments completed:" + assignmentCount
                    );

                    if (assignmentCount > 0) {
                        double assignmentAverage =
                                (double) assignmentPoints / assignmentCount;

                        System.out.println(
                                "Assignment average: " + assignmentAverage
                        );
                    } else {
                        System.out.println("No assignment results yet");
                    }

                    System.out.println(
                            "Exams completed: " + examCount
                    );

                    if (examCount > 0) {
                        double examAverage =
                                (double) examPoints / examCount;

                        System.out.println(
                                "Exam average:" + examAverage
                        );
                    } else {
                        System.out.println("No exam results yet");
                    }

                    if (assignmentCount == 0 && examCount == 0) {
                        System.out.println("No results available yet.");
                    } else {
                        double overallAverage;

                        if (assignmentCount > 0 && examCount > 0) {
                            double assignmentAverage =
                                    (double) assignmentPoints / assignmentCount;

                            double examAverage =
                                    (double) examPoints / examCount;

                            overallAverage =
                                    assignmentAverage * 0.50
                                            + examAverage * 0.50;

                        } else if (assignmentCount > 0) {
                            overallAverage =
                                    (double) assignmentPoints / assignmentCount;

                            System.out.println(
                                    "оverall average uses assignment results only"
                            );

                        } else {
                            overallAverage =
                                    (double) examPoints / examCount;

                            System.out.println(
                                    "Overall average uses exam results only."
                            );
                        }

                        System.out.println(
                                "Overall average: " + overallAverage
                        );

                        if (overallAverage >= 90) {
                            System.out.println("Grade: A");
                        } else if (overallAverage >= 80) {
                            System.out.println("Grade: B");
                        } else if (overallAverage >= 70) {
                            System.out.println("Grade: C");
                        } else if (overallAverage >= 60) {
                            System.out.println("Grade: D");
                        } else {
                            System.out.println("Grade:F");
                        }

                        if (overallAverage >= 60) {
                            System.out.println("Status:Passing");
                        } else {
                            System.out.println("Status: Failing");
                        }
                    }
                    break;
                }

                case 4:
                    System.out.println("Grade tracker closed");
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