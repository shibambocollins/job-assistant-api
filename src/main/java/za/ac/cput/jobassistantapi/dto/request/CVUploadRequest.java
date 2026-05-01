package za.ac.cput.jobassistantapi.dto.request;

public class CVUploadRequest {

    private Long userId;
    private String blobUrl;
    private String originalFilename;

    public Long getUserId() {
        return userId;
    }

    public String getBlobUrl() {
        return blobUrl;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }
}