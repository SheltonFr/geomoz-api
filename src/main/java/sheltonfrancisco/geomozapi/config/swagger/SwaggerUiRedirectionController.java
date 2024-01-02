package sheltonfrancisco.geomozapi.config.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SwaggerUiRedirectionController {

    @GetMapping(value = {"/swagger-ui", "/swagger-ui/", "/swagger"})
    public RedirectView redirect() {
        return new RedirectView("/swagger-ui/index.html");
    }

}
