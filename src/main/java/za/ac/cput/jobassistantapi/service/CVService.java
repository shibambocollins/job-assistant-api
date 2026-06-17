package za.ac.cput.jobassistantapi.service;

import za.ac.cput.jobassistantapi.dto.request.CVUploadRequest;
import za.ac.cput.jobassistantapi.dto.response.CVResponse;
import org.springframework.web.multipart.MultipartFile;
import za.ac.cput.jobassistantapi.dto.response.CVUploadResponse;

public interface CVService {

    CVResponse uploadCV(CVUploadRequest request, String email);
    CVUploadResponse uploadFile(MultipartFile file, String email);
}