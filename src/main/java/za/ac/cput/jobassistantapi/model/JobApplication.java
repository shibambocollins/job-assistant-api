package za.ac.cput.jobassistantapi.model;

import za.ac.cput.jobassistantapi.model.enums.ApplicationStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class JobApplication {

    private Long id;
    private Long userId;
    private Long jobId;
    private ApplicationStatus status;
    private LocalDate appliedDate;
    private LocalDateTime createdAt;

    private JobApplication(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.jobId = builder.jobId;
        this.status = builder.status;
        this.appliedDate = builder.appliedDate;
        this.createdAt = builder.createdAt;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getJobId() {
        return jobId;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public static class Builder {
        private Long id;
        private Long userId;
        private Long jobId;
        private ApplicationStatus status;
        private LocalDate appliedDate;
        private LocalDateTime createdAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setStatus(ApplicationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setAppliedDate(LocalDate appliedDate) {
            this.appliedDate = appliedDate;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder copy(JobApplication app) {
            this.id = app.id;
            this.userId = app.userId;
            this.jobId = app.jobId;
            this.status = app.status;
            this.appliedDate = app.appliedDate;
            this.createdAt = app.createdAt;
            return this;
        }

        public JobApplication build() {
            return new JobApplication(this);
        }
    }
}