package com.project.resume_generator.model;

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
        StringBuilder sb = new StringBuilder();
        if (skillType != null && !skillType.isEmpty()) {
            sb.append(skillType).append(": ");
        }
        if (skills != null && !skills.isEmpty()) {
            sb.append(String.join(", ", skills));
        }
        return sb.toString();
    }
}
