package za.ac.cput.jobassistantapi.model;

import java.time.LocalDateTime;

public class Analysis {

    private Long id;
    private Long jobId;
    private Long jobApplicationId; // nullable
    private Long cvId;
    private Integer matchScore;
    private String missingSkills;
    private String aiSuggestions;
    private String strengths;
    private LocalDateTime createdAt;

    private Analysis(Builder builder) {
        this.id = builder.id;
        this.jobId = builder.jobId;
        this.jobApplicationId = builder.jobApplicationId;
        this.cvId = builder.cvId;
        this.matchScore = builder.matchScore;
        this.missingSkills = builder.missingSkills;
        this.aiSuggestions = builder.aiSuggestions;
        this.strengths = builder.strengths;
        this.createdAt = builder.createdAt;
    }

    public Long getId() {
        return id;
    }

    public Long getJobId() {
        return jobId;
    }

    public Long getJobApplicationId() {
        return jobApplicationId;
    }

    public Long getCvId() {
        return cvId;
    }

    public Integer getMatchScore() {
        return matchScore;
    }

    public String getMissingSkills() {
        return missingSkills;
    }

    public String getAiSuggestions() {
        return aiSuggestions;
    }

    public String getStrengths() {
        return strengths;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public static class Builder {
        private Long id;
        private Long jobId;
        private Long jobApplicationId;
        private Long cvId;
        private Integer matchScore;
        private String missingSkills;
        private String aiSuggestions;
        private String strengths;
        private LocalDateTime createdAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setJobApplicationId(Long jobApplicationId) {
            this.jobApplicationId = jobApplicationId;
            return this;
        }

        public Builder setCvId(Long cvId) {
            this.cvId = cvId;
            return this;
        }

        public Builder setMatchScore(Integer matchScore) {
            this.matchScore = matchScore;
            return this;
        }

        public Builder setMissingSkills(String missingSkills) {
            this.missingSkills = missingSkills;
            return this;
        }

        public Builder setAiSuggestions(String aiSuggestions) {
            this.aiSuggestions = aiSuggestions;
            return this;
        }

        public Builder setStrengths(String strengths) {
            this.strengths = strengths;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder copy(Analysis analysis) {
            this.id = analysis.id;
            this.jobId = analysis.jobId;
            this.jobApplicationId = analysis.jobApplicationId;
            this.cvId = analysis.cvId;
            this.matchScore = analysis.matchScore;
            this.missingSkills = analysis.missingSkills;
            this.aiSuggestions = analysis.aiSuggestions;
            this.strengths = analysis.strengths;
            this.createdAt = analysis.createdAt;
            return this;
        }

        public Analysis build() {
            return new Analysis(this);
        }
    }
}