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
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public void setAnswerOne(String answer_one) {
        this.answer_one = answer_one;
    }
    
    public void setAnswerTwo(String answer_two) {
        this.answer_two = answer_two;
    }
    
    public void setAnswerThree(String answer_three) {
        this.answer_three = answer_three;
    }
    
    public void setAnswerFour(String answer_four) {
        this.answer_four = answer_four;
    }
    
    public void setCorrectAnswer(char correct_answer) {
        this.correct_answer = correct_answer;
    }
    
    public String getQuestion() {
        return this.question;
    }
    
    public String getAnswerOne() {
        return this.answer_one;
    }
    
    public String getAnswerTwo() {
        return this.answer_two;
    }
    
    public String getAnswerThree() {
        return this.answer_three;
    }
    
    public String getAnswerFour() {
        return this.answer_four;
    }
    
    public char getCorrectAnswer() {
        return this.correct_answer;
    }
}
