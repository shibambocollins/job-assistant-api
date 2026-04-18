package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AnalysisTest {

    private static Analysis analysis;

    @BeforeAll
    static void setUp() {
        analysis = new Analysis.Builder()
                .setId(1L)
                .setJobId(100L)
                .setJobApplicationId(null)
                .setCvId(10L)
                .setMatchScore(75)
                .setMissingSkills("Docker, Kubernetes")
                .setAiSuggestions("Learn Docker and build projects")
                .setStrengths("Strong Java and Spring Boot skills")
                .setCreatedAt(LocalDateTime.now())
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(analysis);
        System.out.println(analysis);
    }

    @Test
    @Order(2)
    void getMatchScore() {
        assertEquals(75, analysis.getMatchScore());
    }

    @Test
    @Order(3)
    void getMissingSkills() {
        assertTrue(analysis.getMissingSkills().contains("Docker"));
    }

    @Test
    @Order(4)
    void copy() {
        Analysis copied = new Analysis.Builder()
                .copy(analysis)
                .setMatchScore(85)
                .build();

        assertNotNull(copied);
        assertEquals(85, copied.getMatchScore());
    }
}