package com.project.resume_generator.model;

public class Education {
    private String schoolName;
    private String degreeType;

    public Education(String schoolName, String degreeType) {
        this.schoolName = schoolName;
        this.degreeType = degreeType;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (degreeType != null && !degreeType.isEmpty()) {
            sb.append(degreeType);
        }
        if (schoolName != null && !schoolName.isEmpty()) {
            if (!sb.isEmpty()) sb.append(" - ");
            sb.append(schoolName);
        }
        return sb.toString();
    }
}
