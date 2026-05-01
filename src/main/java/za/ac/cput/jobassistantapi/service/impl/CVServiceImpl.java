package za.ac.cput.jobassistantapi.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.jobassistantapi.dto.request.CVUploadRequest;
import za.ac.cput.jobassistantapi.dto.response.CVResponse;
import za.ac.cput.jobassistantapi.model.CV;
import za.ac.cput.jobassistantapi.model.User;
import za.ac.cput.jobassistantapi.repository.CVRepository;
import za.ac.cput.jobassistantapi.repository.UserRepository;
import za.ac.cput.jobassistantapi.service.CVService;

@Service
public class CVServiceImpl implements CVService {

    private final UserRepository userRepository;
    private final CVRepository cvRepository;

    public CVServiceImpl(CVRepository cvRepository,
                         UserRepository userRepository) {
        this.cvRepository = cvRepository;
        this.userRepository = userRepository;
    }

    @Override
    public CVResponse uploadCV(CVUploadRequest request, String email) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (cvRepository.findByUserId(user.getId()).isPresent()) {
            throw new RuntimeException("User already has a CV");
        }

        CV cv = new CV.Builder()
                .setUserId(user.getId())
                .setBlobUrl(request.getBlobUrl())
                .setOriginalFilename(request.getOriginalFilename())
                .build();

        CV saved = cvRepository.save(cv);

        return new CVResponse(saved.getId(), "CV uploaded successfully");
    }
}