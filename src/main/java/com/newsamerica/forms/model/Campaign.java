package com.newsamerica.forms.model;

import org.springframework.data.annotation.Id;

public class Campaign {
    @Id
    public String id;

    public FormTemplate formTemplate;

    public Campaign() {
    }

    public Campaign(FormTemplate formTemplate) {
        this.formTemplate = formTemplate;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id='" + id + '\'' +
                ", formTemplate=" + formTemplate +
                '}';
    }
}
