package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;
import za.ac.cput.jobassistantapi.model.enums.ApplicationStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JobApplicationTest {

    private static JobApplication app;

    @BeforeAll
    static void setUp() {
        app = new JobApplication.Builder()
                .setId(1L)
                .setUserId(1L)
                .setJobId(100L)
                .setStatus(ApplicationStatus.APPLIED)
                .setAppliedDate(LocalDate.now())
                .setCreatedAt(LocalDateTime.now())
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(app);
        System.out.println(app);
    }

    @Test
    @Order(2)
    void getStatus() {
        assertEquals(ApplicationStatus.APPLIED, app.getStatus());
    }

    @Test
    @Order(3)
    void getJobId() {
        assertEquals(100L, app.getJobId());
    }

    @Test
    @Order(4)
    void copy() {
        JobApplication copied = new JobApplication.Builder()
                .copy(app)
                .setStatus(ApplicationStatus.INTERVIEW)
                .build();

        assertNotNull(copied);
        assertEquals(ApplicationStatus.INTERVIEW, copied.getStatus());
    }
}