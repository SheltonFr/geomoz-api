package sheltonfrancisco.geomozapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

public record ExceptionDetails (
        HttpStatusCode statusCode,
        HttpStatus httpStatus,
        String message,
        LocalDateTime timestamp
) {
}
