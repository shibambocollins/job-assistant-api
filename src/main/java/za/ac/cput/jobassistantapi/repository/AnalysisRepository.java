package za.ac.cput.jobassistantapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.jobassistantapi.model.Analysis;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnalysisRepository extends JpaRepository<Analysis, Long> {

    List<Analysis> findByJobApplication_Id(Long jobApplicationId);

    List<Analysis> findByCv_Id(Long cvId);

    Optional<Analysis> findTopByJobApplication_IdOrderByCreatedAtDesc(Long jobApplicationId);
}