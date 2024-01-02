package sheltonfrancisco.geomozapi.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class EnumTypes {

    @AllArgsConstructor
    @Getter
    public enum Region {
        NORTH("Norte"),
        SOUTH("SUL"),
        CENTER("Centro");
        private String name;
    }
}
