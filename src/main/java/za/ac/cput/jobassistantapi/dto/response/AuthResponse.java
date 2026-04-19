package za.ac.cput.jobassistantapi.dto.response;

public class AuthResponse {

    private String message;

    public AuthResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}