package za.ac.cput.jobassistantapi.model;

import java.time.LocalDateTime;

public class User {

    private Long id;
    private String email;
    private String passwordHash;
    private String fullName;
    private LocalDateTime createdAt;

    private User(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.passwordHash = builder.passwordHash;
        this.fullName = builder.fullName;
        this.createdAt = builder.createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public static class Builder {
        private Long id;
        private String email;
        private String passwordHash;
        private String fullName;
        private LocalDateTime createdAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPasswordHash(String passwordHash) {
            this.passwordHash = passwordHash;
            return this;
        }

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder copy(User user) {
            this.id = user.id;
            this.email = user.email;
            this.passwordHash = user.passwordHash;
            this.fullName = user.fullName;
            this.createdAt = user.createdAt;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}