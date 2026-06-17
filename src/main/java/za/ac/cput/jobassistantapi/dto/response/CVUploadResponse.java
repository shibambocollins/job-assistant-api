package za.ac.cput.jobassistantapi.dto.response;

public class CVUploadResponse {

    private Long cvId;
    private String fileName;

    public CVUploadResponse(Long cvId, String fileName) {
        this.cvId = cvId;
        this.fileName = fileName;
    }

    public Long getCvId() {
        return cvId;
    }

    public String getFileName() {
        return fileName;
    }
}