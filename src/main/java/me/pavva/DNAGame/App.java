package me.pavva.DNAGame;

import java.util.Scanner;
import java.util.Random;


@SuppressWarnings("unused")
public class App {
    public static void main(String[] args) throws IllegalArgumentException {

        Question q1 = new Question("How many base pairs are there?", "1", "2", "4", "14", 'C');
        Question q2 = new Question("What is the shape of a DNA molecule?", "Double Helix", "Single Helix", "Ladder", "Chain", 'A');
        Question q3 = new Question("What two base pairs are purines?", "Adenine, Thymine", "Adenine, Guanine", "Thymine, Guanine", "Cytosine, Guanine", 'B');
        Question q4 = new Question("What two base pairs are pyrimidines?", "Adenine, Thymine", "Thymine, Cytosine", "Adenine, Cytosine", "Guanine, Cytosine", 'B');

        Question[] QuestionList = {q1, q2, q3, q4};

        Scanner sc = new Scanner(System.in);
        double score = 0.0;

        for (Question q : QuestionList) {

            System.out.println(q.getQuestion() + "\nA -\t" + q.getAnswerOne() + "\nB -\t" + q.getAnswerTwo() + "\nC -\t"
                               + q.getAnswerThree() + "\nD -\t" + q.getAnswerFour());
            char yourAnswer = sc.next().charAt(0);

            if (yourAnswer == q.getCorrectAnswer()) {

                score += 1;
                System.out.println("Correct!");

            } else if (yourAnswer != q.getCorrectAnswer()) {

                System.out.println("Sorry, that's incorrect");

            } else {

                sc.close();
                throw new IllegalArgumentException("Hmmm, that doesn't look like an answer...");

            }
        }

        if (score > 0.9 * QuestionList.length) {

            System.out.println("Wow! You scored a " + score / QuestionList.length + "/" + QuestionList.length + " !");

        } else if (score < 0.9 * QuestionList.length && score > 0.5 * QuestionList.length) {

            System.out.println("Not Bad! You scored a " + score + "/" + QuestionList.length + " !");

        } else if (score < 0.5 * QuestionList.length) {

            System.out.println("You can do better than that! You scored a " + score / QuestionList.length + "/" + QuestionList.length + " !");

        }
        sc.close();
    }
}
