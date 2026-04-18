package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CVTest {

    private static CV cv;

    @BeforeAll
    static void setUp() {
        cv = new CV.Builder()
                .setId(1L)
                .setUserId(1L)
                .setBlobUrl("https://blob.url/cv.pdf")
                .setOriginalFilename("cv.pdf")
                .setExtractedText("Java Spring Boot Developer")
                .setSkillsJson("{\"skills\": [\"Java\", \"Spring\"]}")
                .setUploadedAt(LocalDateTime.now())
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(cv);
        System.out.println(cv);
    }

    @Test
    @Order(2)
    void getUserId() {
        assertEquals(1L, cv.getUserId());
    }

    @Test
    @Order(3)
    void getSkillsJson() {
        assertTrue(cv.getSkillsJson().contains("Java"));
    }

    @Test
    @Order(4)
    void copy() {
        CV copied = new CV.Builder()
                .copy(cv)
                .setOriginalFilename("updated_cv.pdf")
                .build();

        assertNotNull(copied);
        assertEquals("updated_cv.pdf", copied.getOriginalFilename());
    }
}