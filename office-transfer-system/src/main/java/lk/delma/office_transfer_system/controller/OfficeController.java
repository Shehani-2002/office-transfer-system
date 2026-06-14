package lk.delma.office_transfer_system.controller;
import lk.delma.office_transfer_system.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lk.delma.office_transfer_system.entity.Office;

@RestController
@RequestMapping("/api/offices")
public class OfficeController {

    @Autowired
    private OfficeService officeService;

    @PostMapping
    public Office create(@RequestBody Office office) {
        return officeService.saveOffice(office);
    }

    @GetMapping
    public List<Office> getAll() {
        return officeService.getAll();
    }
}