package sheltonfrancisco.geomozapi.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GeoMozException.class)
    public ResponseEntity<ExceptionDetails> handleGeoMozException(GeoMozException exception) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .httpStatus(exception.getHttpStatus())
                        .statusCode(HttpStatusCode.valueOf(exception.getHttpStatus().value()))
                        .message(exception.getMeessage())
                        .timestamp(LocalDateTime.now()).build(),
                exception.getHttpStatus()
        );
    }
}
