package za.ac.cput.jobassistantapi.model;

import za.ac.cput.jobassistantapi.model.enums.JobSource;

import java.time.LocalDateTime;

public class Job {

    private Long id;
    private String externalId;
    private String title;
    private String company;
    private String description;
    private String location;
    private JobSource source;
    private LocalDateTime fetchedAt;

    private Job(Builder builder) {
        this.id = builder.id;
        this.externalId = builder.externalId;
        this.title = builder.title;
        this.company = builder.company;
        this.description = builder.description;
        this.location = builder.location;
        this.source = builder.source;
        this.fetchedAt = builder.fetchedAt;
    }

    public Long getId() {
        return id;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public JobSource getSource() {
        return source;
    }

    public LocalDateTime getFetchedAt() {
        return fetchedAt;
    }

    public static class Builder {
        private Long id;
        private String externalId;
        private String title;
        private String company;
        private String description;
        private String location;
        private JobSource source;
        private LocalDateTime fetchedAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setSource(JobSource source) {
            this.source = source;
            return this;
        }

        public Builder setFetchedAt(LocalDateTime fetchedAt) {
            this.fetchedAt = fetchedAt;
            return this;
        }

        public Builder copy(Job job) {
            this.id = job.id;
            this.externalId = job.externalId;
            this.title = job.title;
            this.company = job.company;
            this.description = job.description;
            this.location = job.location;
            this.source = job.source;
            this.fetchedAt = job.fetchedAt;
            return this;
        }

        public Job build() {
            return new Job(this);
        }
    }
}