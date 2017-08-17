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
        Question q5 = new Question("Which three individuals discovered the shape of DNA?", "James Watson and Francis Crick", "James Watson and Rosalind Franklin", "Hillary Clinton and Donald Trump", "James Crick and Francis Watson", 'A');
        Question q6 = new Question("Where is DNA located in the cell?", "Cytoplasm", "Mitochondria", "Cell membrane", "Nucleous/ Nucleolus", 'D');
        Question q7 = new Question("How large is a chromosome?", "2 nanometers", "2 inches", "2 meters", "2 centimeters", 'B');
        Question q8 = new Question("How many chromosomes do humans have?", "46", "23", "11", "5", 'A');
        Question q9 = new Question("How many pairs of chromosomes do humans have?", "46", "23", "11", "5", 'B');
        Question q10 = new Question("What passes on traits of parents to offspring?", "DNA", "Chromosomes", "RNA", "Gametes", 'A');
        Question q11 = new Question("Do all organisms have the same amount of chromosomes?", "Yes", "No", "All of the above", "None of the above", 'B');
        Question q12 = new Question("What fields has DNA been used in?", "Criminology", "Gene Therapy", "Finding lost people", "All of the above", 'D');
        
        Question[] QuestionList = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12};

        Scanner sc = new Scanner(System.in);
        double score = 0.0;

        for (Question q : QuestionList) {

            System.out.print(q.getQuestion() + "\nA -\t" + q.getAnswerOne() + "\nB -\t" + q.getAnswerTwo() + "\nC -\t"
                               + q.getAnswerThree() + "\nD -\t" + q.getAnswerFour() + "\n>> ");
            char yourAnswer = sc.next().charAt(0);

            if (yourAnswer == q.getCorrectAnswer()) {

                score += 1;
                System.out.println("Correct!\n");

            } else if (yourAnswer != q.getCorrectAnswer()) {

                System.out.println("Sorry, that's incorrect\n");

            } else {

                sc.close();
                throw new IllegalArgumentException("Hmmm, that doesn't look like an answer...");

            }
        }

        if (score >= 0.9 * QuestionList.length) {

            System.out.println("Wow! You scored a " + score / QuestionList.length + "/" + QuestionList.length + " !");

        } else if (score < 0.9 * QuestionList.length && score >= 0.5 * QuestionList.length) {

            System.out.println("Not Bad! You scored a " + score + "/" + QuestionList.length + " !");

        } else if (score  < 0.5 * QuestionList.length) {

            System.out.println("You can do better than that! You scored a " + score / QuestionList.length + "/" + QuestionList.length + " !");

        }
        sc.close();
    }
}
