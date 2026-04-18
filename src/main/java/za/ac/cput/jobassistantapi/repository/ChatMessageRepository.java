package za.ac.cput.jobassistantapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.jobassistantapi.model.ChatMessage;

import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

    List<ChatMessage> findByUser_Id(Long userId);

    List<ChatMessage> findTop10ByUser_IdOrderBySentAtDesc(Long userId);

    List<ChatMessage> findByUser_IdOrderBySentAtAsc(Long userId);
}