package za.ac.cput.jobassistantapi.service;

import za.ac.cput.jobassistantapi.dto.request.CVUploadRequest;
import za.ac.cput.jobassistantapi.dto.response.CVResponse;

public interface CVService {

    CVResponse uploadCV(CVUploadRequest request, String email);
}