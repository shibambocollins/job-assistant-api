package za.ac.cput.jobassistantapi.model;

import jakarta.persistence.*;
import za.ac.cput.jobassistantapi.model.enums.ApplicationStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "job_applications")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Job job;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private LocalDate appliedDate;

    private LocalDateTime createdAt;

    protected JobApplication() {}

    private JobApplication(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.job = builder.job;
        this.status = builder.status;
        this.appliedDate = builder.appliedDate;
        this.createdAt = builder.createdAt;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Job getJob() {
        return job;
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
        private User user;
        private Job job;
        private ApplicationStatus status;
        private LocalDate appliedDate;
        private LocalDateTime createdAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setJob(Job job) {
            this.job = job;
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
            this.user = app.user;
            this.job = app.job;
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