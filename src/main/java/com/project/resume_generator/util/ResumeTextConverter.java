package com.project.resume_generator.util;

import com.project.resume_generator.*;
import com.project.resume_generator.model.*;

import java.io.FileWriter;
import java.io.IOException;

public class ResumeTextConverter {

    private static final String LINE_SEPARATOR = System.lineSeparator();
    private static final String SECTION_SEPARATOR = LINE_SEPARATOR + "========================================" + LINE_SEPARATOR;

    public static String convertToText(Resume resume) {
        if (resume == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        // Header
        sb.append(resume.getFullName().toUpperCase()).append(LINE_SEPARATOR);
        sb.append("Email: ").append(resume.getEmail()).append(LINE_SEPARATOR);
        sb.append("Phone: ").append(resume.getPhone()).append(LINE_SEPARATOR);

        // Objective
        if (resume.getObjective() != null) {
            sb.append(SECTION_SEPARATOR);
            sb.append("OBJECTIVE").append(LINE_SEPARATOR);
            sb.append(resume.getObjective().getObjectiveStatement()).append(LINE_SEPARATOR);
        }

        // Education
        if (!resume.getEducations().isEmpty()) {
            sb.append(SECTION_SEPARATOR);
            sb.append("EDUCATION").append(LINE_SEPARATOR);
            for (Education education : resume.getEducations()) {
                sb.append(education.getSchoolName()).append("/n").append(education.getDegreeType()).append(LINE_SEPARATOR);
            }
        }

        // Work History
        if (!resume.getWorkHistory().isEmpty()) {
            sb.append(SECTION_SEPARATOR);
            sb.append("WORK HISTORY").append(LINE_SEPARATOR);
            for (WorkHistory work : resume.getWorkHistory()) {
                sb.append(work.toString()).append(LINE_SEPARATOR);
            }
        }

        // Projects
        if (!resume.getProjects().isEmpty()) {
            sb.append(SECTION_SEPARATOR);
            sb.append("PROJECTS").append(LINE_SEPARATOR);
            for (Project project : resume.getProjects()) {
                sb.append(project.toString()).append(LINE_SEPARATOR);
            }
        }

        // Skills
        if (!resume.getSkills().isEmpty()) {
            sb.append(SECTION_SEPARATOR);
            sb.append("SKILLS").append(LINE_SEPARATOR);
            for (SkillGroup skillGroup : resume.getSkills()) {
                sb.append(skillGroup.toString()).append(LINE_SEPARATOR);
            }
        }

        return sb.toString();
    }

    public static void saveToFile(Resume resume, String filePath) throws IOException {
        String textContent = convertToText(resume);
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
        }
    }
}
