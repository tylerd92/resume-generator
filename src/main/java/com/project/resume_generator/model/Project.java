package com.project.resume_generator.model;

public class Project {
    private String projectName;
    private String details;

    public Project(String projectName, String details) {
        this.projectName = projectName;
        this.details = details;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (projectName != null && !projectName.isEmpty()) {
            sb.append(projectName);
        }
        if (details != null && !details.isEmpty()) {
            if (!sb.isEmpty()) sb.append(System.lineSeparator());
            sb.append(details);
        }
        return sb.toString();
    }
}
