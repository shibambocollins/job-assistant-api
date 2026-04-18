package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;
import za.ac.cput.jobassistantapi.model.enums.ApplicationStatus;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JobApplicationTest {

    private static JobApplication app;
    private static User user;
    private static Job job;

    @BeforeAll
    static void setUp() {

        user = new User.Builder()
                .setId(1L)
                .setEmail("test@test.com")
                .setPasswordHash("hashed")
                .setFullName("Test User")
                .build();

        job = new Job.Builder()
                .setId(100L)
                .setTitle("Java Dev")
                .setCompany("Google")
                .setSource(za.ac.cput.jobassistantapi.model.enums.JobSource.MUSE)
                .build();

        app = new JobApplication.Builder()
                .setUser(user)
                .setJob(job)
                .setStatus(ApplicationStatus.APPLIED)
                .setAppliedDate(LocalDate.now())
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(app);
    }

    @Test
    @Order(2)
    void getStatus() {
        assertEquals(ApplicationStatus.APPLIED, app.getStatus());
    }

    @Test
    @Order(3)
    void getUser() {
        assertEquals("test@test.com", app.getUser().getEmail());
    }

    @Test
    @Order(4)
    void copy() {
        JobApplication copied = new JobApplication.Builder()
                .copy(app)
                .setStatus(ApplicationStatus.INTERVIEW)
                .build();

        assertEquals(ApplicationStatus.INTERVIEW, copied.getStatus());
    }
}