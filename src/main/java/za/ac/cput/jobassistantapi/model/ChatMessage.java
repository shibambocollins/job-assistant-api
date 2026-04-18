package za.ac.cput.jobassistantapi.model;

import java.time.LocalDateTime;

public class ChatMessage {

    private Long id;
    private Long userId;
    private String userMessage;
    private String aiResponse;
    private String contextSnapshot; // optional
    private LocalDateTime sentAt;

    private ChatMessage(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.userMessage = builder.userMessage;
        this.aiResponse = builder.aiResponse;
        this.contextSnapshot = builder.contextSnapshot;
        this.sentAt = builder.sentAt;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public String getAiResponse() {
        return aiResponse;
    }

    public String getContextSnapshot() {
        return contextSnapshot;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public static class Builder {
        private Long id;
        private Long userId;
        private String userMessage;
        private String aiResponse;
        private String contextSnapshot;
        private LocalDateTime sentAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserMessage(String userMessage) {
            this.userMessage = userMessage;
            return this;
        }

        public Builder setAiResponse(String aiResponse) {
            this.aiResponse = aiResponse;
            return this;
        }

        public Builder setContextSnapshot(String contextSnapshot) {
            this.contextSnapshot = contextSnapshot;
            return this;
        }

        public Builder setSentAt(LocalDateTime sentAt) {
            this.sentAt = sentAt;
            return this;
        }

        public Builder copy(ChatMessage message) {
            this.id = message.id;
            this.userId = message.userId;
            this.userMessage = message.userMessage;
            this.aiResponse = message.aiResponse;
            this.contextSnapshot = message.contextSnapshot;
            this.sentAt = message.sentAt;
            return this;
        }

        public ChatMessage build() {
            return new ChatMessage(this);
        }
    }
}