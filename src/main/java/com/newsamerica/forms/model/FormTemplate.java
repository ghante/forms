package com.newsamerica.forms.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class FormTemplate {

    public List<Question> questions;

    public FormTemplate() {
    }

    public FormTemplate(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "FormTemplate{" +
                ", questions=" + questions +
                '}';
    }
}
