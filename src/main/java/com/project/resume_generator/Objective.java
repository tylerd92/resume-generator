package com.project.resume_generator;

public class Objective {
    private String objectiveStatement;

    public Objective(String objectiveStatement) {
        this.objectiveStatement = objectiveStatement;
    }

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
