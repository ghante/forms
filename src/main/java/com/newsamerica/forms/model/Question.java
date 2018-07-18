package com.newsamerica.forms.model;

public class Question {
    public int index;
    public QuestionType type;
    public String question;

    public Question() {
    }

    public Question(int index, QuestionType type, String question) {
        this.index = index;
        this.type = type;
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "type=" + type +
                ", question='" + question + '\'' +
                '}';
    }
}
