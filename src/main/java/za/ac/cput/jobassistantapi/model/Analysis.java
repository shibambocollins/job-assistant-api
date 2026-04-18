package za.ac.cput.jobassistantapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "analysis")
public class Analysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private JobApplication jobApplication;

    @ManyToOne(optional = false)
    private CV cv;

    private Integer matchScore;

    @Lob
    private String missingSkills;

    @Lob
    private String aiSuggestions;

    @Lob
    private String strengths;

    private LocalDateTime createdAt;

    protected Analysis() {}

    private Analysis(Builder builder) {
        this.id = builder.id;
        this.jobApplication = builder.jobApplication;
        this.cv = builder.cv;
        this.matchScore = builder.matchScore;
        this.missingSkills = builder.missingSkills;
        this.aiSuggestions = builder.aiSuggestions;
        this.strengths = builder.strengths;
        this.createdAt = builder.createdAt;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public JobApplication getJobApplication() {
        return jobApplication;
    }

    public CV getCv() {
        return cv;
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
        private JobApplication jobApplication;
        private CV cv;
        private Integer matchScore;
        private String missingSkills;
        private String aiSuggestions;
        private String strengths;
        private LocalDateTime createdAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setJobApplication(JobApplication jobApplication) {
            this.jobApplication = jobApplication;
            return this;
        }

        public Builder setCv(CV cv) {
            this.cv = cv;
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
            this.jobApplication = analysis.jobApplication;
            this.cv = analysis.cv;
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