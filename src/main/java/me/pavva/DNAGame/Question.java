package me.pavva.DNAGame;

public class Question {
    
    private String question;
    private String answer_one;
    private String answer_two;
    private String answer_three;
    private String answer_four;
    private char correct_answer;
    
    public Question(String the_question,
                    String first_choice,
                    String second_choice,
                    String thrid_choice,
                    String fourth_choice,
                    char correct_choice) {
        
        this.question = the_question;
        this.answer_one = first_choice;
        this.answer_two = second_choice;
        this.answer_three = thrid_choice;
        this.answer_four = fourth_choice;
        this.correct_answer = correct_choice;
    }
}
