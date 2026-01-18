package com.project.resume_generator.model;

import java.util.List;

public class WorkHistory {
    private String jobTitle;
    private String companyName;
    private String startDate;
    private String endDate;
    private List<String> details;

    public WorkHistory(String jobTitle, String companyName, String startDate, String endDate, List<String> details) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.details = details;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Job title and company on first line
        sb.append(jobTitle).append(" - ").append(companyName);

        // Date range on second line
        sb.append(System.lineSeparator());
        sb.append(startDate).append(" to ").append(endDate);

        // Job details as bullet points
        if (details != null && !details.isEmpty()) {
            for (String detail : details) {
                sb.append(System.lineSeparator());
                sb.append("• ").append(detail);
            }
        }

        return sb.toString();
    }
}
