package com.project.resume_generator;

import java.util.List;

public class Skills {
    private String skillType;
    private List<String> skills;

    public Skills(String skillType, List<String> skills) {
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
}
