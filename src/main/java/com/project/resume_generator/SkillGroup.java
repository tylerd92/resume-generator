package com.project.resume_generator;

import java.util.List;

public class SkillGroup {
    private String skillType;
    private List<String> skills;

    public SkillGroup(String skillType, List<String> skills) {
        this.skillType = skillType;
        this.skills = skills;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skillType='" + skillType + '\'' +
                ", skills=" + skills +
                '}';
    }
}
