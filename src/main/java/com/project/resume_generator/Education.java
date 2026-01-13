package com.project.resume_generator;

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
        return "Education{" +
                "schoolName='" + schoolName + '\'' +
                ", degreeType='" + degreeType + '\'' +
                '}';
    }
}
