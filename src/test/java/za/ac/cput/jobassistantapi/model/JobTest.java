package za.ac.cput.jobassistantapi.model;

import org.junit.jupiter.api.*;
import za.ac.cput.jobassistantapi.model.enums.JobSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JobTest {

    private static Job job;

    @BeforeAll
    static void setUp() {
        job = new Job.Builder()
                .setId(1L)
                .setExternalId("MUSE123")
                .setTitle("Software Developer")
                .setCompany("Google")
                .setDescription("Software Developer role")
                .setLocation("Remote")
                .setSource(JobSource.MUSE)
                .build();
    }

    @Test
    @Order(1)
    void build() {
        assertNotNull(job);
    }

    @Test
    @Order(2)
    void getTitle() {
        assertEquals("Software Developer", job.getTitle());
    }

    @Test
    @Order(3)
    void getSource() {
        assertEquals(JobSource.MUSE, job.getSource());
    }

    @Test
    @Order(4)
    void copy() {
        Job copied = new Job.Builder()
                .copy(job)
                .setCompany("Amazon")
                .build();

        assertEquals("Amazon", copied.getCompany());
    }
}