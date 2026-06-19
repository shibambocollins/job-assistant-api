package za.ac.cput.jobassistantapi.dto.request;

import org.springframework.web.multipart.MultipartFile;

public class CVUploadRequest {

    private String blobUrl;
    private String originalFilename;
    private MultipartFile file;

    public String getBlobUrl() {
        return blobUrl;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }



    public void setBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}