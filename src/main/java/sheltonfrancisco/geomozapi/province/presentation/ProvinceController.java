package sheltonfrancisco.geomozapi.province.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sheltonfrancisco.geomozapi.province.domain.Province;
import sheltonfrancisco.geomozapi.province.domain.request.CreateProvinceRequest;
import sheltonfrancisco.geomozapi.province.service.ProvinceService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/provinces")
public class ProvinceController {

    private final ProvinceService service;

    @PostMapping
    public ResponseEntity<Province> create(@RequestBody CreateProvinceRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping
    public ResponseEntity<Page<Province>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
