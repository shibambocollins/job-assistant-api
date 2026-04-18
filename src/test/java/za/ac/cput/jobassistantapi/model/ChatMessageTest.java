package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ChatMessageTest {

    private static ChatMessage message;
    private static User user;

    @BeforeAll
    static void setUp() {

        user = new User.Builder()
                .setId(1L)
                .setEmail("test@test.com")
                .setPasswordHash("hash")
                .setFullName("Test User")
                .build();

        message = new ChatMessage.Builder()
                .setUser(user)
                .setUserMessage("Which job suits me best?")
                .setAiResponse("You are best suited for backend roles.")
                .setContextSnapshot("CV: Java, Spring | Jobs: Backend roles")
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(message);
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
    void relationshipTest() {
        assertEquals("test@test.com", message.getUser().getEmail());
    }

    @Test
    @Order(5)
    void copy() {
        ChatMessage copied = new ChatMessage.Builder()
                .copy(message)
                .setUserMessage("Updated question")
                .build();

        assertEquals("Updated question", copied.getUserMessage());
    }
}