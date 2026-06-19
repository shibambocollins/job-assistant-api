package za.ac.cput.jobassistantapi.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.jobassistantapi.dto.response.SkillExtractionResult;
import za.ac.cput.jobassistantapi.service.SkillExtractionService;
import za.ac.cput.jobassistantapi.util.SkillDictionary;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillExtractionServiceImpl implements SkillExtractionService {

    @Override
    public SkillExtractionResult extract(String text) {

        if (text == null || text.isBlank()) {
            return new SkillExtractionResult(List.of());
        }

        String normalized = text.toLowerCase();

        List<String> skillsFound = new ArrayList<>();

        for (String skill : SkillDictionary.SKILLS) {

            if (normalized.contains(skill)) {
                skillsFound.add(skill);
            }
        }

        return new SkillExtractionResult(skillsFound);
    }
}