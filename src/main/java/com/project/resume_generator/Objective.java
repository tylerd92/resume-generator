package com.project.resume_generator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class Objective {
    private String objectiveStatement;

    @JsonCreator
    public Objective(String objectiveStatement) {
        this.objectiveStatement = objectiveStatement;
    }

    @JsonValue
    public String getObjectiveStatement() {
        return objectiveStatement;
    }

    public void setObjectiveStatement(String objectiveStatement) {
        this.objectiveStatement = objectiveStatement;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "objectiveStatement='" + objectiveStatement + '\'' +
                '}';
    }
}
