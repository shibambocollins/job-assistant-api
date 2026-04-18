package za.ac.cput.jobassistantapi.model;

import java.time.LocalDateTime;

public class CV {

    private Long id;
    private Long userId;
    private String blobUrl;
    private String originalFilename;
    private String extractedText;
    private String skillsJson;
    private LocalDateTime uploadedAt;

    private CV(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.blobUrl = builder.blobUrl;
        this.originalFilename = builder.originalFilename;
        this.extractedText = builder.extractedText;
        this.skillsJson = builder.skillsJson;
        this.uploadedAt = builder.uploadedAt;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getBlobUrl() {
        return blobUrl;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public String getExtractedText() {
        return extractedText;
    }

    public String getSkillsJson() {
        return skillsJson;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public static class Builder {
        private Long id;
        private Long userId;
        private String blobUrl;
        private String originalFilename;
        private String extractedText;
        private String skillsJson;
        private LocalDateTime uploadedAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder setBlobUrl(String blobUrl) {
            this.blobUrl = blobUrl;
            return this;
        }

        public Builder setOriginalFilename(String originalFilename) {
            this.originalFilename = originalFilename;
            return this;
        }

        public Builder setExtractedText(String extractedText) {
            this.extractedText = extractedText;
            return this;
        }

        public Builder setSkillsJson(String skillsJson) {
            this.skillsJson = skillsJson;
            return this;
        }

        public Builder setUploadedAt(LocalDateTime uploadedAt) {
            this.uploadedAt = uploadedAt;
            return this;
        }

        public Builder copy(CV cv) {
            this.id = cv.id;
            this.userId = cv.userId;
            this.blobUrl = cv.blobUrl;
            this.originalFilename = cv.originalFilename;
            this.extractedText = cv.extractedText;
            this.skillsJson = cv.skillsJson;
            this.uploadedAt = cv.uploadedAt;
            return this;
        }

        public CV build() {
            return new CV(this);
        }
    }
}