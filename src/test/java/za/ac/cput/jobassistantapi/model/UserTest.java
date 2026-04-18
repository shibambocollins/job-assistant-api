package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserTest {

    private static User user;

    @BeforeAll
    static void setUp() {
        user = new User.Builder()
                .setId(1L)
                .setEmail("collins@example.com")
                .setPasswordHash("hashed123")
                .setFullName("Collins")
                .setCreatedAt(LocalDateTime.now())
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(user);
        System.out.println(user);
    }

    @Test
    @Order(2)
    void getEmail() {
        assertEquals("collins@example.com", user.getEmail());
    }

    @Test
    @Order(3)
    void getFullName() {
        assertEquals("Collins", user.getFullName());
    }

    @Test
    @Order(4)
    void copy() {
        User copied = new User.Builder()
                .copy(user)
                .setFullName("Updated Name")
                .build();

        assertNotNull(copied);
        assertEquals("Updated Name", copied.getFullName());
    }
}