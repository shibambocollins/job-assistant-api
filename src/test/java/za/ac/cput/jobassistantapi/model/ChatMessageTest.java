package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ChatMessageTest {

    private static ChatMessage message;

    @BeforeAll
    static void setUp() {
        message = new ChatMessage.Builder()
                .setId(1L)
                .setUserId(1L)
                .setUserMessage("Which job suits me best?")
                .setAiResponse("You are best suited for backend roles.")
                .setContextSnapshot("CV: Java, Spring | Jobs: Backend roles")
                .setSentAt(LocalDateTime.now())
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(message);
        System.out.println(message);
    }

    @Test
    @Order(2)
    void getUserMessage() {
        assertEquals("Which job suits me best?", message.getUserMessage());
    }

    @Test
    @Order(3)
    void getAiResponse() {
        assertTrue(message.getAiResponse().contains("backend"));
    }

    @Test
    @Order(4)
    void copy() {
        ChatMessage copied = new ChatMessage.Builder()
                .copy(message)
                .setUserMessage("Updated question")
                .build();

        assertNotNull(copied);
        assertEquals("Updated question", copied.getUserMessage());
    }
}