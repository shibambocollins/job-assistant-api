package za.ac.cput.jobassistantapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.jobassistantapi.model.CV;

import java.util.Optional;

@Repository
public interface CVRepository extends JpaRepository<CV, Long> {

    Optional<CV> findByUserId(Long userId);

    boolean existsByUserId(Long userId);
}