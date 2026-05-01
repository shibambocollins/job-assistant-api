package za.ac.cput.jobassistantapi.dto.request;

public class CVUploadRequest {

    private Long userId;
    private String blobUrl;
    private String originalFilename;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

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