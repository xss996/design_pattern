package com.xss.design_pattern.mvc_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentController {
    private Student model;
    private StudentView view;

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentGrade(int grade) {
        model.setGrade(grade);
    }

    public int getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.printStudentInfo(model);
    }
}
