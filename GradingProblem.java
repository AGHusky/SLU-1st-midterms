package Exercises.midterms;

import java.util.Scanner;
public class GradingProblem{
    public static void main(String[] args) {

        //Variables
        Scanner kbd = new Scanner(System.in);
        int perfectTotalQuizScore = 0, totalQuizScore = 0, examScore = 0, perfectExamScore = 0;
        double quizGrade = 0, examGrade = 0, numericGrade = 0;
        char letterGrade = 'I';

        //get student name
        String studentName = "";
        System.out.println("This program helps you compute the prelim grade of a student.");
        System.out.println();
        System.out.print("Enter the name of the student: ");
        studentName = kbd.nextLine();
        System.out.print("Enter the perfect total quiz score: ");
        perfectTotalQuizScore = kbd.nextInt();

        //implies
        if (perfectTotalQuizScore <= 0) {
            System.out.println("Invalid perfect score! The perfect score should be " + "greater than zero");
                    System.out.println("Sorry! The program needs to close. Run the program " + "again and enter correct values.");
                            System.exit(0);
        }

        // get score of student
        System.out.print("Enter the total quiz score of " + studentName + ":");
        totalQuizScore = kbd.nextInt();

        //implies
        if(totalQuizScore > perfectTotalQuizScore || totalQuizScore < 0){
        System.out.println("Invalid score. The score should not exceed the perfect score " +
                perfectTotalQuizScore + " and it should not be less than 0.");
        //close program
        System.out.println("Sorry! The program needs to close. Run the program again and " +
                "enter correct values.");
        System.exit(0);
    }

        //get exam score
        System.out.print("Enter the perfect examination score: ");
           perfectExamScore = kbd.nextInt();

        if (perfectExamScore <= 0) {
        //Insert code
            System.out.println("Invalid perfect score! The perfect score should be " + "greater than zero");
            System.out.println("Sorry! The program needs to close. Run the program " + "again and enter correct values.");
            System.exit(0);
            }

        System.out.print("Enter the examination score of " + studentName + ":");
            examScore = kbd.nextInt();
        if (examScore > perfectExamScore || examScore < 0) {
                System.out.println("Invalid score. The exam score should not exceed the perfect " +
                        "score " + perfectExamScore + " and it should not be less than 0.");
                System.out.println("Sorry! The program needs to close. Run the program again " +
                        "and enter correct values.");
                System.exit(0);
            }
            quizGrade = (double) (totalQuizScore/perfectTotalQuizScore) * 50 + 50;
            examGrade = (double) examScore / perfectExamScore * 50 + 50;
            numericGrade = (quizGrade + examGrade) / 2;
        if (numericGrade >= 50 && numericGrade < 75) {
                letterGrade = 'D';
            }
        if (numericGrade >= 75 && numericGrade < 80) {
                letterGrade = 'C';
            }
        if (numericGrade >= 80 && numericGrade < 90) {
                letterGrade = 'B';
            }
        if (numericGrade >= 90 && numericGrade <= 100) {
                letterGrade = 'A';
            }
        System.out.println();
        System.out.printf("%-30s%20s%n", "Name of Student", studentName);
        System.out.printf("%-30s%20d%n", "Total Quiz Score = ", totalQuizScore);
        System.out.printf("%-30s%20d%n", "Perfect Total Quiz Score = ", perfectTotalQuizScore);
        System.out.printf("%-30s%20.0f%n", "Grade for the Quizzes = ", quizGrade);
        System.out.printf("%-30s%20d%n", "Examination Score = ", examScore);
        System.out.printf("%-30s%20d%n", "Perfect Examination Score = ", perfectExamScore);
        System.out.printf("%-30s%20.0f%n", "Grade for the Exam = ", examGrade);
        System.out.println();
        System.out.printf("%-30s%20.0f%n", "Numeric Grade = ", numericGrade);
        System.out.printf("%-30s%20c%n", "Letter Grade = ", letterGrade);
        System.exit(0);
    }
}
