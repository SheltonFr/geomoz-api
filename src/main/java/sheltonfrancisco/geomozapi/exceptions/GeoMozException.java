package sheltonfrancisco.geomozapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class GeoMozException extends RuntimeException {
    private String meessage;
    private HttpStatus httpStatus;

    public GeoMozException(String message) {
        super(message);
        this.httpStatus = HttpStatus.BAD_REQUEST;
    }
}
