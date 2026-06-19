package za.ac.cput.jobassistantapi.dto.response;

import java.util.List;

public class SkillExtractionResult {

    private List<String> skills;

    public SkillExtractionResult() {}

    public SkillExtractionResult(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}