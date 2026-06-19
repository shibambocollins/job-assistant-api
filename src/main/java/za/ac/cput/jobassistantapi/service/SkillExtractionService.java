package za.ac.cput.jobassistantapi.service;

import java.util.Set;

public interface SkillExtractionService {
    Set<String> extractSkills(String text);
}