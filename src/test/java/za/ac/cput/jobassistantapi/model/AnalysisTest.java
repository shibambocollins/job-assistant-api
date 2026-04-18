package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AnalysisTest {

    private static Analysis analysis;
    private static JobApplication app;
    private static CV cv;

    @BeforeAll
    static void setUp() {

        User user = new User.Builder()
                .setId(1L)
                .setEmail("test@test.com")
                .setPasswordHash("hash")
                .setFullName("Test User")
                .build();

        Job job = new Job.Builder()
                .setId(100L)
                .setTitle("Java Dev")
                .setCompany("Google")
                .setSource(za.ac.cput.jobassistantapi.model.enums.JobSource.MUSE)
                .build();

        app = new JobApplication.Builder()
                .setUser(user)
                .setJob(job)
                .build();

        cv = new CV.Builder()
                .setId(10L)
                .setUserId(1L)
                .setBlobUrl("url")
                .setOriginalFilename("cv.pdf")
                .setExtractedText("Java dev")
                .setSkillsJson("{Java}")
                .build();

        analysis = new Analysis.Builder()
                .setJobApplication(app)
                .setCv(cv)
                .setMatchScore(75)
                .setMissingSkills("Docker, Kubernetes")
                .setAiSuggestions("Learn Docker")
                .setStrengths("Java + Spring")
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(analysis);
    }

    @Test
    @Order(2)
    void getMatchScore() {
        assertEquals(75, analysis.getMatchScore());
    }

    @Test
    @Order(3)
    void relationshipTest() {
        assertEquals("Google", analysis.getJobApplication().getJob().getCompany());
    }

    @Test
    @Order(4)
    void copy() {
        Analysis copied = new Analysis.Builder()
                .copy(analysis)
                .setMatchScore(90)
                .build();

        assertEquals(90, copied.getMatchScore());
    }
}