package za.ac.cput.jobassistantapi.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.jobassistantapi.service.SkillExtractionService;
import za.ac.cput.jobassistantapi.util.SkillDictionary;

import java.util.HashSet;
import java.util.Set;

@Service
public class SkillExtractionServiceImpl implements SkillExtractionService {

    @Override
    public Set<String> extractSkills(String text) {

        if (text == null) return Set.of();

        String normalized = text.toLowerCase();

        Set<String> foundSkills = new HashSet<>();

        for (String skill : SkillDictionary.SKILLS) {
            if (normalized.contains(skill)) {
                foundSkills.add(skill);
            }
        }

        return foundSkills;
    }
}