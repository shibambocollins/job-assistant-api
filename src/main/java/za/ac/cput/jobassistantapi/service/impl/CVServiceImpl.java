package za.ac.cput.jobassistantapi.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.jobassistantapi.dto.request.CVUploadRequest;
import za.ac.cput.jobassistantapi.dto.response.CVResponse;
import za.ac.cput.jobassistantapi.model.CV;
import za.ac.cput.jobassistantapi.repository.CVRepository;
import za.ac.cput.jobassistantapi.service.CVService;

@Service
public class CVServiceImpl implements CVService {

    private final CVRepository cvRepository;

    public CVServiceImpl(CVRepository cvRepository) {
        this.cvRepository = cvRepository;
    }

    @Override
    public CVResponse uploadCV(CVUploadRequest request) {

        if (cvRepository.findByUserId(request.getUserId()).isPresent()) {
            throw new RuntimeException("User already has a CV. Use update instead.");
        }

        CV cv = new CV.Builder()
                .setUserId(request.getUserId())
                .setBlobUrl(request.getBlobUrl())
                .setOriginalFilename(request.getOriginalFilename())
                .build();

        CV saved = cvRepository.save(cv);
        return new CVResponse(saved.getId(), "CV uploaded successfully");
    }
}