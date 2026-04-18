package za.ac.cput.jobassistantapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "chat_messages")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @Lob
    private String userMessage;

    @Lob
    private String aiResponse;

    @Lob
    private String contextSnapshot;

    private LocalDateTime sentAt;

    protected ChatMessage() {}

    private ChatMessage(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.userMessage = builder.userMessage;
        this.aiResponse = builder.aiResponse;
        this.contextSnapshot = builder.contextSnapshot;
        this.sentAt = builder.sentAt;
    }

    @PrePersist
    public void onCreate() {
        this.sentAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
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
        private User user;
        private String userMessage;
        private String aiResponse;
        private String contextSnapshot;
        private LocalDateTime sentAt;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
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
            this.user = message.user;
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