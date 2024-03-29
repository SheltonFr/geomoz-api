package sheltonfrancisco.geomozapi.exceptions;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

@Builder
public record ExceptionDetails (
        HttpStatusCode statusCode,
        HttpStatus httpStatus,
        String message,
        LocalDateTime timestamp
) {
}
