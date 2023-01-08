package interfaceproject;

import java.util.Scanner;

public class MainQuestions {
	
	private static Question[] questions;  // The questions for any quiz

    private static double[] userAnswers;   // The user's answers to the ten questions.
    
    private static Scanner stdin = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to Basic Arithmetic and Non-arithmetic quiz");
        System.out.println();
        System.out.println("The are 10 questions in this quiz.");
        System.out.println("Some are math questions and a few conversion problems.");
        System.out.println("For division and conversion, you must round your answer to the nearest hundredth. ");
        System.out.println();
        createQuiz(); //create the quiz first.
        administerQuiz(); //start asking the question.
        gradeQuiz(); //grade the answer of the user.
    }
    
    
    /**
     * Creates the array of objects that holds the quiz questions
     */
    
    private static void createQuiz() {
        questions = new Question[10];
        for ( int i = 0; i < 7; i++ ) {
            if (Math.random() <= 0.1)
                questions[i] = new AdditionQuestion();
            else if (Math.random() <= 0.2)
            	questions[i] = new MultiplicationQuestion();
            else if (Math.random() < 0.3)
                questions[i] = new SubtractionQuestion();
            else
                questions[i] = new DivisionQuestion();
        }
        questions[7] = new GeneralQuestion("How many miles in 1 Kilometer (Converted to the nearest hundredth. )?", 0.62);
        questions[8] = new GeneralQuestion("How many pounds in 1 Kilogram (Converted to the nearest hundredth. )?", 2.20);
        questions[9] = new GeneralQuestion("How many US gallons in 1 liter? ", 0.26);
    } //end of CreateQuiz()
    
    /**
     * Asks the user each of the ten quiz questions and gets the user's answers.
     * The answers are stored in an array, which is created in this subroutine.
     */
    private static void administerQuiz() {
        userAnswers = new double[10];
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  %s ",
                                  questionNum, questions[i].getQuestion());
            userAnswers[i] = stdin.nextDouble();
        }
    } //end of administerQuiz
    
    
    /**
     * Shows all the questions, with their correct answers, and computes a grade
     * for the quiz.  For each question, the user is told whether they got
     * it right.
     */
    private static void gradeQuiz() {
        System.out.println();
        System.out.println("Here are the correct answers:");
        System.out.println();
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            System.out.println("Question number " + (i+1) + ":");
            System.out.println("    " + questions[i].getQuestion());
            System.out.println("    Correct answer:  " + questions[i].getCorrectAnswer());
            if ( userAnswers[i] == questions[i].getCorrectAnswer() ) {
                System.out.println("    You were CORRECT.");
                numberCorrect++;
            }
            else {
                System.out.println("    You said " + userAnswers[i] + ", which is INCORRECT.");
            }
            System.out.println();
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    } //end of gradeQuiz()
    
    
    
    

} //end of class MainQuestion
