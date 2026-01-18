package com.project.resume_generator.model;

import java.util.ArrayList;
import java.util.List;

public class Resume {
    private String fullName;
    private String email;
    private String phone;
    private Objective objective;
    private List<Education> educations = new ArrayList<>();
    private List<WorkHistory> workHistory = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();
    private List<SkillGroup> skills = new ArrayList<>();

    public Resume() {
        this.fullName = "";
        this.email = "";
        this.phone = "";
    }

    public Resume(String fullName, String email, String phone, Objective objective,
                  List<Education> educations, List<WorkHistory> workHistory,
                  List<Project> projects, List<SkillGroup> skills) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.objective = objective;
        if (educations != null) this.educations = new ArrayList<>(educations);
        if (workHistory != null) this.workHistory = new ArrayList<>(workHistory);
        if (projects != null) this.projects = new ArrayList<>(projects);
        if (skills != null) this.skills = new ArrayList<>(skills);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations != null ? new ArrayList<>(educations) : new ArrayList<>();
    }

    public List<WorkHistory> getWorkHistory() {
        return workHistory;
    }

    public void setWorkHistory(List<WorkHistory> workHistory) {
        this.workHistory = workHistory != null ? new ArrayList<>(workHistory) : new ArrayList<>();
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects != null ? new ArrayList<>(projects) : new ArrayList<>();
    }

    public List<SkillGroup> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillGroup> skills) {
        this.skills = skills != null ? new ArrayList<>(skills) : new ArrayList<>();
    }

    public void addEducation(Education education) {
        if (education != null) this.educations.add(education);
    }

    public void addWorkHistory(WorkHistory work) {
        if (work != null) this.workHistory.add(work);
    }

    public void addProject(Project project) {
        if (project != null) this.projects.add(project);
    }

    public void addSkills(SkillGroup skillGroupEntry) {
        if (skillGroupEntry != null) this.skills.add(skillGroupEntry);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", objective=" + objective +
                ", educations=" + educations +
                ", workHistory=" + workHistory +
                ", projects=" + projects +
                ", skills=" + skills +
                '}';
    }
}