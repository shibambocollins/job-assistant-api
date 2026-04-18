package za.ac.cput.jobassistantapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.jobassistantapi.model.Job;
import za.ac.cput.jobassistantapi.model.enums.JobSource;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    Optional<Job> findByExternalId(String externalId);

    boolean existsByExternalId(String externalId);

    List<Job> findBySource(JobSource source);

    List<Job> findByCompanyContainingIgnoreCase(String company);

    List<Job> findByTitleContainingIgnoreCase(String title);
}