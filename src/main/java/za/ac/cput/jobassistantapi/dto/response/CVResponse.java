package za.ac.cput.jobassistantapi.dto.response;

public class CVResponse {

    private Long id;
    private String message;

    public CVResponse(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}