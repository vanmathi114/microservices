package Online.Shopping.Platform.Exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponse {

    private String message;
    private String details;
    private LocalDateTime timestamp;

    public ErrorResponse(String message, String details) {
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();  // Capture the current time when the error occurs
    }

    // Getters and Setters
}
