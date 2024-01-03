package sheltonfrancisco.geomozapi.province.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sheltonfrancisco.geomozapi.province.domain.Province;
import sheltonfrancisco.geomozapi.province.domain.ProvinceMapper;
import sheltonfrancisco.geomozapi.province.domain.request.CreateProvinceRequest;
import sheltonfrancisco.geomozapi.province.service.ProvinceService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/provinces")
public class ProvinceController {

    private final ProvinceService service;

    @PostMapping
    public ResponseEntity<ProvinceJson> create(@RequestBody CreateProvinceRequest request) {
        return ResponseEntity.ok(ProvinceMapper.INSTANCE.mapToJson(service.create(request)));
    }

    @GetMapping
    public ResponseEntity<Page<ProvinceJson>> findAll(@PageableDefault(size = 11, page = 0) Pageable pageable) {
        return ResponseEntity.ok(ProvinceMapper.INSTANCE.mapToJson(service.findAll(pageable)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
